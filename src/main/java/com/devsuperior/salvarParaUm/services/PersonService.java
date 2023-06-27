package com.devsuperior.salvarParaUm.services;

import com.devsuperior.salvarParaUm.dto.PersonDTO;
import com.devsuperior.salvarParaUm.dto.PersonDepartmentDTO;
import com.devsuperior.salvarParaUm.entities.Department;
import com.devsuperior.salvarParaUm.entities.Person;
import com.devsuperior.salvarParaUm.repositories.DepartmentRepository;
import com.devsuperior.salvarParaUm.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department department = departmentRepository.getReferenceById(dto.getDepartment().getId());
        //department.setId(dto.getDepartmentDTO().getId());
        entity.setDepartment(department);
        entity = repository.save(entity);

        return new PersonDepartmentDTO(entity);
    }

    /*@Transactional
    public PersonDTO insert(PersonDTO dto) {
        Person person = new Person();
        person.setName(dto.getName());
        person.setSalary(dto.getSalary());

        Department department = new Department();
        department.setId(dto.getDepartmentId());
        person.setDepartment(department);
        person = repository.save(person);

        return new PersonDTO(person);
    }*/
}
