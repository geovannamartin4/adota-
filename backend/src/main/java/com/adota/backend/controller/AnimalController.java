package com.adota.backend.controller;

import com.adota.backend.entity.Animal;
import com.adota.backend.service.AnimalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    public Animal cadastrar(Animal animal) {    
    return animalRepository.save(animal);
    }

}

