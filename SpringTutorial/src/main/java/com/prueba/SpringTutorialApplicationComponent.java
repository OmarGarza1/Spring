package com.prueba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.prueba.component.ComponentDao;
import com.prueba.scope.PersonDao;

@SpringBootApplication
@ComponentScan("com.prueba")
public class SpringTutorialApplicationComponent {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialApplicationComponent.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringTutorialApplicationComponent.class, args);

		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);

		LOGGER.info("{}", componentDao);

	}

}
