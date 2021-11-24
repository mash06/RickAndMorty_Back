package com.maria.model.rickandmorty;

import java.util.List;

public class MovieDto {

    public List<Hero> results;

    public MovieDto() {}

    public List<Hero> getResults() {
        return results;
    }

    public void setResults(List<Hero> results) {
        this.results = results;
    }
}
