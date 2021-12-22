package com.bolsadeideas.springboot.di.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FornController {
	
	@GetMapping("/form")
	public String form (Model model) {
		return "form";
	}

	@PostMapping("/form")
	public String procesar(Model model) {
		return "resultado";
	}
}
