package com.miage.altea.trainer_api.service;

import com.miage.altea.trainer_api.bo.Trainer;
import com.miage.altea.trainer_api.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("trainerApiRestTemplate")
public class TrainerServiceImpl implements TrainerService {

    private TrainerRepository trainerRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public Optional<Trainer> getTrainer(String name) {
        return trainerRepository.findById(name);
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        trainer.setPassword(bCryptPasswordEncoder.encode(trainer.getPassword()));
        return trainerRepository.save(trainer);
    }

    @Override
    public Trainer updateTrainer(Trainer trainer) {
        trainer.setPassword(bCryptPasswordEncoder.encode(trainer.getPassword()));
        return trainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainer(String trainerName) {
        trainerRepository.deleteById(trainerName);
    }
}

