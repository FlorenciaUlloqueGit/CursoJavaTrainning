package com.example.demo.Service;

import java.util.List;



import com.example.demo.Models.Producto;

public interface IProductoService {
	
	
	public List<Producto> findAll();
	public void save(Producto producto);
	
	


}
