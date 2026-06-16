package com.pluralsight.sneakerdrops.sneakerdrops.controllers;


import com.pluralsight.sneakerdrops.sneakerdrops.models.Sneaker;
import com.pluralsight.sneakerdrops.sneakerdrops.service.SneakerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Sneaker> getAll(){
        return sneakerService.allSneakers();
    }

    @GetMapping("/count")
    public long count(){
        return sneakerService.count();
    }
}
