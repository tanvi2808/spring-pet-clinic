package com.springlearning.service;

import com.springlearning.model.Pet;
import com.springlearning.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {


    Vet findByLastName(String lastName);

}
