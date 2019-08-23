package com.prueba.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Persona implements InitializingBean, DisposableBean{

	private int id;
	private String nombre;
	private String apellido;
	private Pais pais;
	private Ciudad ciudad;

	/*
	@PostConstruct
	private void init() 
	{
		System.out.println("Antes de inicializar el bean");
	}
	
	@PreDestroy
	private void destroy() 
	{
		System.out.println("Antes de ser destruidon");
	}
	*/
	
	public Persona() {
		
	}

	public Persona(int id, String nombre, String apellido, Pais pais) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
	}

	public Persona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(int id) {
		this.id = id;
	}

	public Persona(String apellido) {
		this.apellido = apellido;
	}

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	//	System.out.println("Antes de inicializar el bean");		
	}

	@Override
	public void destroy() throws Exception {
	//	System.out.println("Antes de ser destruidon");
		
	}

}
