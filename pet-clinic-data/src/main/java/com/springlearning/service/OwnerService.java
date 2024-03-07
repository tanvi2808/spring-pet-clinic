package com.springlearning.service;

import com.springlearning.model.Owner;

import java.util.Locale;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>  {

    Owner findByLastName(String lastName);

}
