package com.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.prueba.basic.BinarySearchImpl;
import com.prueba.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringTutorialApplicationProperties {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(SpringTutorialApplicationProperties.class, args);

		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

		System.out.println(someExternalService.returnServiceURL());

	}

}
