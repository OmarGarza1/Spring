package com.pruebas.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.beans.Ciudad;
import com.prueba.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/prueba/xml/beans.xml");

		Persona per = (Persona) appContext.getBean("persona");

		System.out.println(per.getApellido());
		
		
		((AbstractApplicationContext) appContext).close();
	}

}
