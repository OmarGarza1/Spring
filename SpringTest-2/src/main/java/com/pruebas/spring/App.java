package com.pruebas.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.beans.Barcelona;
import com.prueba.beans.Ciudad;
import com.prueba.beans.Jugador;
import com.prueba.beans.Juventus;
import com.prueba.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/prueba/xml/beans.xml");
		// Jugador jug = (Jugador) appContext.getBean("messi");
		Barcelona bar = (Barcelona) appContext.getBean("barcelona");
		//Juventus jur = (Juventus) appContext.getBean("juventus");
		 System.out.println(bar.mostrar());

		((AbstractApplicationContext) appContext).close();
	}

}
