package com.debuggeando_ideas.interfaces;

import java.util.List;

public class PostgresDB implements DatabaseService{
    @Override
    public String getById(Long id) {
        return "Getting data from Postgres with id: "+id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello word from postgres");
    }
}
