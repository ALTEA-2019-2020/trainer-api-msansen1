package com.miage.altea.trainer_api.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
public class Pokemon {

    @Getter
    @Setter
    private int pokemonTypeId;

    @Getter
    @Setter
    private int level;

    public Pokemon() {
    }

    public Pokemon(int pokemonTypeId, int level) {
        this.pokemonTypeId = pokemonTypeId;
        this.level = level;
    }
}
