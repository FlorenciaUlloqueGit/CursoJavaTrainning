package com.bolsadeideas.springboot.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.app.models.Usuario;


@Controller // lo marca como un controlador
@RequestMapping("/app") //con esto llamamos a todos los métodos de invocación siguentes (handlers). Para que sea pagina de inicio no debe tener el @RequestMapping
public class IndexController {
	//un controlador va a tener metodos de accion o handler que va a manejar peticion http de usuario. 
	//representa una pag web que hace algo y que trabaja con los datos de nuestra aplicación
	// estos datos se van a mostrar en una lista creada con thymeleaf. 
	//el controlador se encarga de manejar las peticiones del usuario , mostrar la página, la respuesta con los datos que el usuario ha solicitado.
	
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;
	
	
	@GetMapping(value = {"/index" ,"/", "/home"})
	public String index(Model model) { //puede usarse model o modelmap. ModelMap es una clase y model no 
		model.addAttribute("titulo",textoIndex);
		return "index";
	}
	
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
	 Usuario usuario = new Usuario();
		usuario.setNombre("Florencia");
		usuario.setApellido("Ulloque");
		usuario.setEmail("m.floo95a@gmail.con");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo",textoPerfil.concat(usuario.getNombre()));
		return "perfil"; //es la vista
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo",textoListar);
	
		
		return "listar";
	}
	
	@ModelAttribute("usuarios") //común  a todos los métodos
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("martin", "cravero", "mcravero@correo.com"),
				new Usuario("martin", "cravero", "mcravero@correo.com"),
				new Usuario ("Florencia", "Ulloque", "fulloque@correo.com"));
		
		return usuarios;
	}
	

}
