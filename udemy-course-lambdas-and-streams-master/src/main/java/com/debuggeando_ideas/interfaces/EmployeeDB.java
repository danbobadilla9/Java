package com.debuggeando_ideas.interfaces;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements DatabaseService<Employee>{
    @Override
    public Employee getById(Long id) {
        Employee employee = new Employee();
        employee.setDni(UUID.randomUUID().toString());
        employee.setName("dan israel");
        employee.setSalary(500.0);

        return employee;
    }

    @Override
    public List<Employee> getAllRecords() {
        return null;
    }
}
