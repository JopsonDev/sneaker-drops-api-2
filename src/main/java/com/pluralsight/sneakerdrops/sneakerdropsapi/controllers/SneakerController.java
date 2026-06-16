package com.pluralsight.sneakerdrops.sneakerdropsapi.controllers;


import com.pluralsight.sneakerdrops.sneakerdropsapi.models.Sneaker;
import com.pluralsight.sneakerdrops.sneakerdropsapi.service.SneakerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sneakers")
@CrossOrigin
public class SneakerController {

    private final SneakerService sneakerService;

    public SneakerController(SneakerService sneakerService) {
        this.sneakerService = sneakerService;
    }

    @GetMapping
    public List<Sneaker> getAll(@RequestParam(required = false) Integer year,
                             @RequestParam(required = false) String model,
                                @RequestParam(required = false) String brand,
                             @RequestParam(required = false) Double minPrice,
                                @RequestParam(required = false) Double maxPrice,
                             @RequestParam(required = false) String sort){
        return sneakerService.search(year, model, brand, minPrice, maxPrice, sort);
    }

    @GetMapping("/{id}")
    public Sneaker findById(@PathVariable long id){
        return sneakerService.byId(id);
    }

    @GetMapping("/count")
    public long count(){
        return sneakerService.count();
    }
}
