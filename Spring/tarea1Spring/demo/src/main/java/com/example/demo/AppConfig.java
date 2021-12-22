package com.example.demo;


import com.example.demo.Models.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Producto crearProducto(){
        return new Producto();
    }
}
