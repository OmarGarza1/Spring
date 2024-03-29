package com.practica;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practica.model.Persona;

@Controller
public class RegistrarController {

	/*
	@RequestMapping("/irRegresar")
	public ModelAndView redireccion() 
	{
		return new ModelAndView("registro", "command", new Persona());
	}
	
	@RequestMapping(value = "/registrar", method = {RequestMethod.GET, RequestMethod.POST})
	public String registrar(Persona per, ModelMap model) 
	{
		model.addAttribute("nombre", per.getNombre());
		model.addAttribute("apellido", per.getApellido());
		return "saludo";
	}
	*/
	@RequestMapping("/irFormulario")
	public ModelAndView irFormulario() 
	{		
		return new ModelAndView("formulario","command", new Persona());
	}

	@RequestMapping(value = "/agregar", method = {RequestMethod.GET, RequestMethod.POST})
	public String agregar(Persona per, ModelMap model) 
	{
		model.addAttribute("nombreModel", per.getNombre());
		model.addAttribute("apellidoModel", per.getApellido());
		return "exito";
	}
	
}
