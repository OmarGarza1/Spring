package com.prueba.spring;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.beans.AppConfig;
import com.prueba.beans.Mundo;

public class App {

	public static void main(String[] args) {

		// ApplicationContext appContext = new
		// ClassPathXmlApplicationContext("com/prueba/xml/beans.xml");
		ApplicationContext appContext = new AnnotationConfigApplicationContext();
		
		((AnnotationConfigApplicationContext) appContext).register(AppConfig.class);
		
		((AbstractApplicationContext) appContext).refresh();

		Mundo m = (Mundo) appContext.getBean("mundo");

		System.out.println(m.getSaludo());

		((AbstractApplicationContext) appContext).close();
	}

}
