package com.bolsadeideas.springboot.di.app.Models.Dominio;

import org.springframework.beans.factory.annotation.Autowired;

public class ItemFactura {
    @Autowired	
	private Producto producto;
	
	private Integer cantidad;
	
	
	public ItemFactura(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public float calcularImporte() {
		return producto.getPrecio() *cantidad;
	}
	
	
	
}
