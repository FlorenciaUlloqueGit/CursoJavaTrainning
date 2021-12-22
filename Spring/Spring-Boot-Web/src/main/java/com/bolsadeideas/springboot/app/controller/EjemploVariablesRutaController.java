package com.bolsadeideas.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo","Enviar parámetros de la ruta (@PathVariable)");
		return "variables/index";
		
	}
	
	@GetMapping("/string/{texto}") //eltexto en pathvariable debe ser igual a el texto que sale en getmapping
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("titulo","Recibir parámetros de la ruta (@PathVariable)");
		model.addAttribute("resultado", "el texto enviado en al ruta es :" + texto );
		return "variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}") 
	public String variables(@PathVariable String texto, @PathVariable Integer numero,Model model) {
		model.addAttribute("titulo","Recibir parámetros de la rutat (@PathVariable)");
		model.addAttribute("resultado", "el texto enviado en al ruta es :" + texto +
			"y el número enviado en el path es:  " + numero);
		return "variables/ver";
	}


}
