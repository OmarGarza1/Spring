package com.prueba.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.prueba.interfaces.IEquipo;

 
public class Jugador implements IEquipo {

	private int id;
	@Value("Greencho")
	private String nombre;
	@Autowired
	@Qualifier("barcelona")
	private IEquipo equipo;
	@Autowired
	private Camiseta camiseta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IEquipo getEquipo() {
		return equipo;
	}

	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

	public Camiseta getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

}
