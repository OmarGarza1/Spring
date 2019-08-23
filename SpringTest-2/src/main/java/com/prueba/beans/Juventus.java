package com.prueba.beans;

import org.springframework.stereotype.Component;

import com.prueba.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo{

	@Override
	public String mostrar() {
	
		return "Juventus";
	}

}
