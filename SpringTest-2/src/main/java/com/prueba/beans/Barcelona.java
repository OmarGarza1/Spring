package com.prueba.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.prueba.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {
		
		return "Barcelona";
	}

}
