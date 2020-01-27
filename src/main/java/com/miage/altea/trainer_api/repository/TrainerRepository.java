package com.miage.altea.trainer_api.repository;

import com.miage.altea.trainer_api.bo.Trainer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrainerRepository extends CrudRepository<Trainer, String> {

    Optional<Trainer> findById(String id);
}
