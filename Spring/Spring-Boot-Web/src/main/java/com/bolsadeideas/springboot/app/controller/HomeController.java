package com.bolsadeideas.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
	//	return "redirect:/app/index"; //redirección a una vista
	//	return "redirect:https://www.google.com"; //redirección a una página web
		return "forward:/app/index"; //redirección con forward. no recarga ni reinicia la página , es mejor opción para una página de inicio. El forward es solo para rutas propias del proyecto, no para páginas externas
	}


}
