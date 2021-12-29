package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.DAO.IProductoDAO;
import com.example.demo.Models.Producto;

public class ProductoServiceImplements  implements IProductoService{
	
	@Autowired
	private IProductoDAO productoDao;
	
	@Override
	@Transactional
	public void save(Producto producto) {
		productoDao.save(producto);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}



}
