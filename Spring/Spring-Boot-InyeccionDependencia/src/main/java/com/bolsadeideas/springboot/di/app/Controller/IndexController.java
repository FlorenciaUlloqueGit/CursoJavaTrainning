package com.bolsadeideas.springboot.di.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.Models.Services.IServicio;

@Controller
public class IndexController {
	@Autowired // busca el objeto MiServicio y lo inyecta
	@Qualifier("MiServicioComplejo")

	private IServicio servicio;

	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	// @Autowired
	// public IndexController(IServicio servicio) {
	// super();
	// this.servicio = servicio;
	// }

	// @Autowired
	// public void setServicio(IServicio servicio) {
//		this.servicio = servicio;
	// }

}
