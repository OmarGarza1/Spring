package com.practica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {

	@RequestMapping("irHola")
	public ModelAndView redirection() 
	{
		ModelAndView MV = new ModelAndView("Hola", "mensaje", "miau");
		
		return MV;
	}
}
