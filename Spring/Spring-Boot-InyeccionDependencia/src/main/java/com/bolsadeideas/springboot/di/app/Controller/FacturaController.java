package com.bolsadeideas.springboot.di.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.di.app.Models.Dominio.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {

	

	@Autowired


  
	private Factura factura;

	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("titulo", "Ejemplo factura con inyección de dependencia");
		return "factura/ver";
		    
	}

}
