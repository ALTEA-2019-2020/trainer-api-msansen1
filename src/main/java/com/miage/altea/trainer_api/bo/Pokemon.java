package com.miage.altea.trainer_api.bo;

import javax.persistence.Embeddable;

@Embeddable
public class Pokemon {

    private int pokemonTypeId;

    private int level;

    public Pokemon() {
    }

    public Pokemon(int pokemonTypeId, int level) {
        this.pokemonTypeId = pokemonTypeId;
        this.level = level;
    }
}
