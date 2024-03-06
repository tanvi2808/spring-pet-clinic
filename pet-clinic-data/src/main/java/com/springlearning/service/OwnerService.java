package com.springlearning.service;

import com.springlearning.model.Owner;

import java.util.Set;

public interface OwnerService   {

    Owner findById(Long id);
    Set<Owner> findAll();

    Owner findByLastName(String lastName);

    Owner save(Owner owner);


}
