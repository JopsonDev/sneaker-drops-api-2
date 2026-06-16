package com.pluralsight.sneakerdrops.sneakerdropsapi.service;

import com.pluralsight.sneakerdrops.sneakerdropsapi.data.BrandRepository;
import com.pluralsight.sneakerdrops.sneakerdropsapi.data.SneakerRepository;
import com.pluralsight.sneakerdrops.sneakerdropsapi.models.Sneaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class SneakerService {

    private final SneakerRepository sneakerRepository;
    private final BrandRepository brandRepository;

    @Autowired
    public SneakerService(SneakerRepository sneakerRepository, BrandRepository brandRepository) {
        this.sneakerRepository = sneakerRepository;
        this.brandRepository = brandRepository;
    }

    public List<Sneaker> search(Integer year, String model, String brand, Double minPrice, Double maxPrice, String sort){
        List<Sneaker> results = new ArrayList<>(sneakerRepository.findAll().stream().filter(g -> year == null || g.getReleaseYear() == year)
                .filter(s -> model == null || s.getModel().equalsIgnoreCase(model))
                .filter(s -> brand == null || s.getBrand().getName().equalsIgnoreCase(brand))
                .filter(s ->  minPrice == null || s.getPrice() >= minPrice)
                .filter(s -> maxPrice == null || s.getPrice() <= maxPrice).toList());

        if("rating".equalsIgnoreCase(sort)){
            results.sort(Comparator.comparingDouble((Sneaker::getPrice)));
        } else if ("model".equalsIgnoreCase(sort)){
            results.sort(Comparator.comparing(Sneaker::getModel));
        }
        return results;
    }

    public Sneaker byId(long id) {
        return sneakerRepository.findById(id).orElse(null);
    }

    public long count(){
        return sneakerRepository.count();
    }
}
