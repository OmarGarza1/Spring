package com.prueba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prueba.scope.PersonDao;

@SpringBootApplication
public class SpringTutorialApplicationScope {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialApplicationScope.class);
	
	public static void main(String[] args) {

		
		
		ApplicationContext applicationContext = SpringApplication.run(SpringTutorialApplicationScope.class, args);

		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}
