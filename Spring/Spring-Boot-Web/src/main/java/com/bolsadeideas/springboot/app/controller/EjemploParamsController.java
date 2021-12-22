package com.bolsadeideas.springboot.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	
	@GetMapping("/string")
	public String param(@RequestParam (required = false ,defaultValue = "algun valor por defecto") String texto , Model model) {
		model.addAttribute("resultado" , "El texto enviado es: " + texto);
		return "params/ver";
	}
	
	
	@GetMapping("")
	public String MostrarEnlacesEnindex() {
		return "params/index";
	}
	
	@GetMapping("/mix-param")
	public String param(@RequestParam String saludo , @RequestParam Integer numero, Model model) { //se puede pantener el nombre del requestParam el param solo si cambio el nombre y cantidad de parametros
		model.addAttribute("resultado" , "El saludo es: '" + saludo + "' y el número es '" + numero + "'");
		return "params/ver";
	}
	
	
	//lo mismo que el otro ejemplo
	@GetMapping("/mix-paramRequest")
	public String param(HttpServletRequest request , Model model) { //se puede pantener el nombre del requestParam el param solo si cambio el nombre y cantidad de parametros
		String saludo = request.getParameter("saludo");
		Integer numero; 
		try { numero = Integer.parseInt(request.getParameter("numero"));
		} catch(NumberFormatException e ) {
			numero = 0;
		}
		
		model.addAttribute("resultado" , "El saludo es: '" + saludo + "' y el número es '" + numero + "'");
		return "params/ver";
	}
}
