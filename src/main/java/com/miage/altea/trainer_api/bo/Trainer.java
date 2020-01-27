package com.miage.altea.trainer_api.bo;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
public class Trainer {

    @Id
    @Getter
    private String name;

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
