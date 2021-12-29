package com.example.demo.Controllers;



import com.example.demo.Models.Producto;
import com.example.demo.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.validation.Valid;


@Controller
public class controladorProducto {

    @Autowired
    private IProductoService productoService;

    @RequestMapping(value = "/listado", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("productos", productoService.findAll());
        model.addAttribute("titulo", "Listado de productos");
       
        return "listado";
    }
    
    
    @RequestMapping(value = "/nuevo", method = RequestMethod.GET)
    public String crearProducto(Model model) {
    	Producto producto = new Producto();
        model.addAttribute("producto", producto);
        model.addAttribute("titulo", "Alta de producto");
       
        return "nuevo";
    }
    
    
    

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public String guardar(@Valid Producto producto, BindingResult result, Model model) { 																			// sino después o antes.
		if (result.hasErrors()) { 
			model.addAttribute("titulo", "Alta de producto");
			return "insertar"; 
		}
		productoService.save(producto);
		return "redirect:listado";
	}
    
    

  
   

  



}
