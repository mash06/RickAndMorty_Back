package com.maria.service;

import com.maria.model.rickandmorty.*;
import com.maria.repo.HeroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Service
public class RickAndMortyServiceImpl implements RickAndMortyService{
    static String id = "";
    private static final String URL = "https://rickandmortyapi.com/api";

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    private final HeroRepo heroRepo;

    @Autowired
    public RickAndMortyServiceImpl(HeroRepo heroRepo) {
        this.heroRepo = heroRepo;
    }

    @Override
    public List<Hero> retrieveHeroes() {

        RestTemplate restTemplate = new RestTemplate();
        logger.info("Sending request to url: " + URL + "/character");
        ResponseEntity<MovieDto> responseEntity = restTemplate.getForEntity(URL +"/character", MovieDto.class);
        MovieDto movie = responseEntity.getBody();
        return movie.getResults() != null ? movie.getResults() : Collections.emptyList();
    }

    @Override
    public List<Episode> retrieveEpisode(){
        RestTemplate restTemplate = new RestTemplate();
        logger.info("Sending request to url: " + URL +"/episode");
        ResponseEntity<ListofEp> responseEntity = restTemplate.getForEntity(URL +"/episode", ListofEp.class);
        ListofEp epis = responseEntity.getBody();
        return epis.getResults() != null ? epis.getResults() : Collections.emptyList();
    }



    @Override
    public List<Location> retrieveLocation(){
        RestTemplate restTemplate = new RestTemplate();
        logger.info("Sending request to url: " + URL +"/location");
        ResponseEntity<ListofLoc> responseEntity = restTemplate.getForEntity(URL +"/location", ListofLoc.class);
        ListofLoc locat = responseEntity.getBody();
        return locat.getResults() != null ? locat.getResults() : Collections.emptyList();
    }

//    @Override
//    public List<Location> getInfo(){
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<ListofLoc> responseEntity = restTemplate.postForEntity()ForEntity(URL +"/location", ListofLoc.class);
//        ListofLoc locat = responseEntity.getBody();
//        return locat.getResults() != null ? locat.getResults() : Collections.emptyList();
//    }



}
