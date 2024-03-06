package com.springlearning.service;

import com.springlearning.model.Pet;
import com.springlearning.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Set<Vet> findAll();

    Vet save(Vet vet);

    Vet findByLastName(String lastName);

}
