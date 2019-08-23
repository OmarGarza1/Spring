package com.pruebas.spring;

import java.util.Scanner;

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

		Scanner scan = new Scanner(System.in);
		System.out.println("Elija un equipo 1-Barcelona //// 2-Juventus");
		int res = scan.nextInt();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/prueba/xml/beans.xml");

		Jugador jug = (Jugador) appContext.getBean("jugador1");

		
		switch (res) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;

		case 2:
			jug.setEquipo(new Juventus());
			break;

		default:
			break;
		}


		System.out.println(jug.getId() + " " + jug.getNombre() + " " + jug.getEquipo().mostrar() + " "
				+ jug.getCamiseta().getNumero() + " " + jug.getCamiseta().getMarca().getNombre());

		((AbstractApplicationContext) appContext).close();
	}

}
