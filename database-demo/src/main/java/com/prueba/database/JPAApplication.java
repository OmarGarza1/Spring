package com.prueba.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prueba.database.entity.Person;
import com.prueba.database.jpa.PersonJpaRepository;

//@Configuration
//@ComponentScan(value = "com.prueba.database.jpa")
//@ComponentScan(value = "com.prueba.database.entity")
//@SpringBootApplication
public class JPAApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 10001 {}", repository.findById(10001));

		logger.info("Inserting  {}", repository.insert(new Person("tara","berlin", new Date())));
		logger.info("Update 10003 {}", repository.update(new Person("pieter","ulte", new Date())));
		logger.info("All users  {}", repository.findById(10001));
		
	}

}
