package com.adota.backend.service;

import com.adota.backend.entity.Animal;
import com.adota.backend.repository.AnimalRepository;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal cadastrar(Animal animal) {
        if (animal.getNome() == null || animal.getNome().isBlank()) {
            throw new RuntimeException("O nome do animal é obrigatório.");
        }

        if (animal.getIdade() < 0) {
            throw new RuntimeException("Digite uma idade válida.");
        }

        if (animal.getUnidadeIdade() == null) {
            throw new RuntimeException("A unidade da idade é obrigatória.");
        }

        if (animal.getEspecie() == null) {
            throw new RuntimeException("A espécie é obrigatória.")
        }

        return animalRepository.save(animal);

    }


}