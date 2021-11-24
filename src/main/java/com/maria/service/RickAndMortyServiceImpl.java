package com.maria.service;

import com.maria.model.rickandmorty.Hero;
import com.maria.model.rickandmorty.MovieDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Service
public class RickAndMortyServiceImpl implements RickAndMortyService{

    private static final String URL = "https://rickandmortyapi.com/api/character";

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public List<Hero> retrieveHeroes() {
        RestTemplate restTemplate = new RestTemplate();
        logger.info("Sending request to url: " + URL);
        ResponseEntity<MovieDto> responseEntity = restTemplate.getForEntity(URL, MovieDto.class);
        MovieDto movie = responseEntity.getBody();
        return movie.getResults() != null ? movie.getResults() : Collections.emptyList();
    }

}
