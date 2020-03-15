package com.miage.altea.trainer_api.controller;

import com.miage.altea.trainer_api.bo.Trainer;
import com.miage.altea.trainer_api.service.TrainerService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/trainers")

public class TrainerController {

    private final TrainerService trainerService;

    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping("/")
    Iterable<Trainer> getAllTrainers(){
        return trainerService.getAllTrainers();
    }

    @PostMapping(value = "/")
    public Trainer createTrainer(@RequestBody Trainer trainer) {
        return trainerService.createTrainer(trainer);
    }

    @PutMapping(value = "/")
    public Trainer updateTrainer(@RequestBody Trainer trainer) {
        return trainerService.updateTrainer(trainer);
    }

    @DeleteMapping("/{name}")
    String deleteTrainer(@PathVariable String name){
        trainerService.deleteTrainer(name);
        return name + " Deleted";
    }

    @GetMapping("/{name}")
    Optional<Trainer> getTrainer(@PathVariable String name){
        return trainerService.getTrainer(name);
    }

}