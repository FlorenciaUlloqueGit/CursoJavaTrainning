package com.example.demo;


import com.example.demo.Models.Producto;
import com.example.demo.Service.IProductoService;
import com.example.demo.Service.ProductoServiceImplements;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

@Configuration
public class AppConfig {

    @Bean
    public Producto crearProducto(){
        return new Producto();
       
        
   
    }
    
    
    @Bean("Producto")
    public IProductoService producto(){
        return new ProductoServiceImplements();
    }
    

    


}
