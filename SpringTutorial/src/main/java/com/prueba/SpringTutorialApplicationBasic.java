package com.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prueba.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringTutorialApplicationBasic {

	public static void main(String[] args) {

		// BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSort());

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringTutorialApplicationBasic.class, args);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);
		
		
		int result = binarySearchImpl.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);

		
	}

}
