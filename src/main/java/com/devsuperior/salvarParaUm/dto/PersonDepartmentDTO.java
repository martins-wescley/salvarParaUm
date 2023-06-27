package com.devsuperior.salvarParaUm.dto;

import com.devsuperior.salvarParaUm.entities.Person;

public class PersonDepartmentDTO {

    private Long id;
    private String name;
    private Double Salary;
    private DepartmentDTO department;

    public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {
        this.id = id;
        this.name = name;
        this.Salary = salary;
        this.department = department;
    }

    public PersonDepartmentDTO(Person entity) {
        id = entity.getId();
        name = entity.getName();
        Salary = entity.getSalary();
        department = new DepartmentDTO(entity.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return Salary;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }
}
