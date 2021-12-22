package com.bolsadeideas.springboot.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.models.service.IClienteService;

@Controller
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("clientes", clienteService.findAll());
		return "listar";
	}

	@RequestMapping(value = "/insertar", method = RequestMethod.GET)
	public String crearUsuario(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente); // en el post debe tener el mismo nombre el atributo que la clase. sino
												// se usa en el post @ModelAttribute("nombre")
		model.addAttribute("titulo", "Formulario de cliente");
		return "insertar";
	}

	@RequestMapping(value = "/insertar", method = RequestMethod.POST)
	public String guardar(@Valid Cliente cliente, BindingResult result, Model model) { // el binding result siempre va
																						// al lado del objeto, no poner																				// sino después o antes.
		if (result.hasErrors()) { // si el form falla entonces....
			model.addAttribute("titulo", "Formulario de cliente");
			return "insertar"; // retorna el form con todos los mensajes de error
		}
		clienteService.save(cliente);
		return "redirect:listar";
	}

	@RequestMapping(value = "/insertar/{id}") // para elegir uno dentro del form
	public String editarUsuario(@PathVariable(value = "id") Long id, Map<String, Object> model) {

		Cliente cliente = null;

		if (id > 0) {
			cliente = clienteService.findOne(id);
		} else {
			return "redirect:/listar";
		}
		model.put("cliente", cliente);
		model.put("titulo", "Editar cliente");

		return "insertar";
	}

	
	@RequestMapping(value= "/eliminar/{id}")
		public String eliminar(@PathVariable(value = "id") Long id) {
		if(id > 0) {
			clienteService.delete(id);
		}
			return "redirect:/listar";
			
		}
	
}
