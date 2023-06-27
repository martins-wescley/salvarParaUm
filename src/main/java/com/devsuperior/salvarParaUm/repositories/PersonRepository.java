package com.devsuperior.salvarParaUm.repositories;

import com.devsuperior.salvarParaUm.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
