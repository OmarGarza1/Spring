package com.pruebas.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prueba.beans.Barcelona;
import com.prueba.beans.Camiseta;
import com.prueba.beans.Jugador;
import com.prueba.beans.Juventus;
import com.prueba.beans.Marca;

@Configuration
public class AppConfig {

	
	@Bean
	public Jugador jugador1() {
		return new Jugador();
	}

	@Bean
	public Barcelona barcelona() {
		return new Barcelona();
	}
	
	@Bean
	public Juventus juventus() {
		return new Juventus();
	}
	
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean
	public Marca marca() {
		return new Marca();
	}
	
}
