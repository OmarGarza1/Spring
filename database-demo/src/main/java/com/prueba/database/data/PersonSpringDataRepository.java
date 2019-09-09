package com.prueba.database.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.database.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
