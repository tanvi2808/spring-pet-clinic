package com.springlearning.service;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> finalAll();
    T findById(Long ID);
    T save(T t);
    void delete(T t);
    void deleteById(Long ID);

}
