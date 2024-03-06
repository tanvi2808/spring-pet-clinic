package com.springlearning.service;

import com.springlearning.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Set<Pet> findAll();

    Pet save(Pet pet);
}
