package com.debuggeando_ideas.interfaces;

import java.util.List;

public interface DatabaseService <T>{

    //se asume que todos los metodos son publicos
    T getById(Long id);
    public List<T> getAllRecords();
}