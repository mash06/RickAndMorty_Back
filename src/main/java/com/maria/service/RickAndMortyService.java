package com.maria.service;

import com.maria.model.rickandmorty.Hero;

import java.util.List;

public interface RickAndMortyService {
  List<Hero> retrieveHeroes();
}
