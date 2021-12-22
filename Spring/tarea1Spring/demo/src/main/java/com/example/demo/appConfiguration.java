package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.example.demo.Models.Producto;
import com.example.demo.Service.IProductoService;
import com.example.demo.Service.ProductoServiceImplements;

@Configuration
public class appConfiguration {
	

    @Bean("Producto")
    public IProductoService producto(){
        return new ProductoServiceImplements();
    }
    
    /* @Bean("listarProductos")
	
	public List<Producto> registrarProductos() {
    	 List<String> listaComentarios = new ArrayList<>();
    	 listaComentarios.add("maximo rendimiento");
    	 listaComentarios.add("no seca las manos");
    	 
    	 List<String> listaComentarios2 = new ArrayList<>();
    	    listaComentarios2.add("No tomar");
    	    listaComentarios2.add("Ph alcalino");
    	 
    	  List<String> listaComentarios3 = new ArrayList<>();
    	    listaComentarios3.add("inflamable");
    	    listaComentarios3.add("De madera de pino");
    	    listaComentarios3.add("300 unidades");
    	    
    	    Producto producto1 = new Producto(1,"Detergente","Ala", 350,listaComentarios );
    	    Producto producto2=   new Producto(2, "Lavandina", "Ayudin", 200,listaComentarios2);
    	    Producto producto3=   new Producto(3,"Fósforos", "Los tres patitos", 300,listaComentarios3);
    	    
    	    return Arrays.asList(producto1, producto2, producto3);
    	
    }
    */
	

}



