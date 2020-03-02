package com.miage.altea.trainer_api.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Trainer {

    @Id
    @Getter
    private String name;

    @Column
    @Getter
    @Setter
    private String password;

    @ElementCollection
    @Getter
    @Setter
    private List<Pokemon> team;

    public Trainer() {
    }

    public Trainer(String name) {
        this.name = name;
    }
}
