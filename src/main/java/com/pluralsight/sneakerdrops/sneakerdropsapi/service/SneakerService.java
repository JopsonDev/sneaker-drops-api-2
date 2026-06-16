package com.pluralsight.sneakerdrops.sneakerdrops.service;

import com.pluralsight.sneakerdrops.sneakerdrops.data.BrandRepository;
import com.pluralsight.sneakerdrops.sneakerdrops.data.SneakerRepository;
import com.pluralsight.sneakerdrops.sneakerdrops.models.Brand;
import com.pluralsight.sneakerdrops.sneakerdrops.models.Sneaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Sneaker> allSneakers() {
        return sneakerRepository.findAll();
    }

    public long count(){
        return sneakerRepository.count();
    }
}
