package com.example.demo.Controllers;


import com.example.demo.Models.Producto;
import com.example.demo.Service.IProductoService;
import com.example.demo.Service.ProductoServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class controladorProducto {

    @Autowired
    private IProductoService productoService;

    @RequestMapping(value = "/listado", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("productos", productoService.listar());
        model.addAttribute("titulo", "Listado de productos");
        return "listado";
    }

  



}
