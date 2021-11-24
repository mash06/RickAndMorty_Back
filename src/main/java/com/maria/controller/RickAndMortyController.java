package com.maria.controller;

import com.maria.model.rickandmorty.Hero;
import com.maria.service.RickAndMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rick-and-morty")
public class RickAndMortyController {

    private final RickAndMortyService service;

    @Autowired
    public RickAndMortyController(RickAndMortyService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Hero> getHeroes(){
        return service.retrieveHeroes();
    }

}
