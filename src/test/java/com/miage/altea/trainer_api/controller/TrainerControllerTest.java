package com.miage.altea.trainer_api.controller;

import com.miage.altea.trainer_api.bo.Trainer;
import com.miage.altea.trainer_api.service.TrainerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.bind.annotation.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;

class TrainerControllerTest {

    @Mock
    private TrainerService trainerService;

    @InjectMocks
    private TrainerController trainerController;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAllTrainers_shouldCallTheService() {
        trainerController.getAllTrainers();

        verify(trainerService).getAllTrainers();
    }

    @Test
    void getTrainer_shouldCallTheService() {
        trainerController.getTrainer("Ash");

        verify(trainerService).getTrainer("Ash");
    }

    @Test
    void trainerController_shouldBeAnnotated(){
        var controllerAnnotation =
                TrainerController.class.getAnnotation(RestController.class);
        assertNotNull(controllerAnnotation);

        var requestMappingAnnotation =
                TrainerController.class.getAnnotation(RequestMapping.class);
        assertArrayEquals(new String[]{"/trainers"}, requestMappingAnnotation.value());
    }

    @Test
    void getAllTrainers_shouldBeAnnotated() throws NoSuchMethodException {
        var getAllTrainers =
                TrainerController.class.getDeclaredMethod("getAllTrainers");
        var getMapping = getAllTrainers.getAnnotation(GetMapping.class);

        assertNotNull(getMapping);
        assertArrayEquals(new String[]{"/"}, getMapping.value());
    }

    @Test
    void getTrainer_shouldBeAnnotated() throws NoSuchMethodException {
        var getTrainer =
                TrainerController.class.getDeclaredMethod("getTrainer", String.class);
        var getMapping = getTrainer.getAnnotation(GetMapping.class);

        var pathVariableAnnotation = getTrainer.getParameters()[0].getAnnotation(PathVariable.class);

        assertNotNull(getMapping);
        assertArrayEquals(new String[]{"/{name}"}, getMapping.value());

        assertNotNull(pathVariableAnnotation);
    }

    @Test
    void updateTrainer_shouldBeAnnotated() throws NoSuchMethodException {
        var updateTrainer =
                TrainerController.class.getDeclaredMethod("updateTrainer", Trainer.class);
        var postMapping = updateTrainer.getAnnotation(PostMapping.class);

        assertNotNull(postMapping);

        var requestBodyAnnotation = updateTrainer.getParameters()[0].getAnnotation(RequestBody.class);
        assertNotNull(requestBodyAnnotation);
    }

    @Test
    void deleteTrainer_shouldBeAnnotated() throws NoSuchMethodException {
        var deleteTrainer =
                TrainerController.class.getDeclaredMethod("deleteTrainer", String.class);
        var DeleteMapping = deleteTrainer.getAnnotation(DeleteMapping.class);

        var pathVariableAnnotation = deleteTrainer.getParameters()[0].getAnnotation(PathVariable.class);

        assertNotNull(DeleteMapping);
        assertArrayEquals(new String[]{"/{name}"}, DeleteMapping.value());

        assertNotNull(pathVariableAnnotation);
    }

    @Test
    void createTrainer_shouldBeAnnotated() throws NoSuchMethodException {
        var createTrainer =
                TrainerController.class.getDeclaredMethod("createTrainer", Trainer.class);
        var CreateTrainer = createTrainer.getAnnotation(PostMapping.class);

        var requestBodyAnnotation = createTrainer.getParameters()[0].getAnnotation(RequestBody.class);

        assertNotNull(CreateTrainer);
        assertNotNull(requestBodyAnnotation);
    }
}
