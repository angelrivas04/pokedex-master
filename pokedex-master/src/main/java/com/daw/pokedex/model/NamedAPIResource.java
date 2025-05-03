package com.daw.pokedex.model;

public class NamedAPIResource {
    private String name;

    public NamedAPIResource() {}

    public NamedAPIResource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
