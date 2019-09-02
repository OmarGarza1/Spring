package com.prueba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prueba.cdi.SomeCDIBusiness;
import com.prueba.scope.PersonDao;

@SpringBootApplication
public class SpringTutorialApplicationCDI {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialApplicationCDI.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringTutorialApplicationCDI.class, args);

		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());

	}

}
