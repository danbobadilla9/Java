package com.debuggeando_ideas.interfaces;

import java.util.List;

public class App {

    public static void main(String[] args) {

//        DatabaseService mongo = new MongoDB();
//        DatabaseService postgres = new PostgresDB();
//
//        System.out.println(mongo.getById(20L));
//        System.out.println(postgres.getById(30L));

        ProductDB productDB = new ProductDB();
        EmployeeDB employeeDB = new EmployeeDB();

        System.out.println(productDB.getById(2L));
        System.out.println(employeeDB.getById(5L));

        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());
        // Esto de aqui es una clase anonima
        DatabaseService<String> databaseService = new DatabaseService<String>(){

            @Override
            public String getById(Long id) {
                return null;
            }

            @Override
            public List<String> getAllRecords() {
                return null;
            }
        };
        System.out.println(databaseService.getClass().getName());

    }

}
