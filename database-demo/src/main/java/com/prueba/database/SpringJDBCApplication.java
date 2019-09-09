package com.prueba.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prueba.database.entity.Person;
import com.prueba.database.jdbc.PersonJdbcDao;

//@Configuration
//@ComponentScan(value = "com.prueba.database.jdbc")
//@SpringBootApplication
public class SpringJDBCApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users {}", personJdbcDao.findAll());
		logger.info("User id 10001 {}", personJdbcDao.findById(10001));
		logger.info("Delete id 10002 {}", personJdbcDao.deleteById(10002));
		logger.info("Inserting 10004 {}", personJdbcDao.insert(new Person(10004, "Marin", "CASA", new Date())));
		logger.info("Updating 10003 {}", personJdbcDao.update(new Person(10003, "Rosa", "PLAYA", new Date())));
		
	}

}
