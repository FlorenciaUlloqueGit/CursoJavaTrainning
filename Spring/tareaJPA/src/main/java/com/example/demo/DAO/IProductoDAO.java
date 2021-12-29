package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Producto;

public interface IProductoDAO  extends CrudRepository<Producto, Integer>{

}
