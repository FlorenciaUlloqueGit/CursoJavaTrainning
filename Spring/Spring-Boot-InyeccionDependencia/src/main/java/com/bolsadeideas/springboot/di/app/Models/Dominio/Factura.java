package com.bolsadeideas.springboot.di.app.Models.Dominio;


import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@RequestScope
public class Factura implements Serializable{

	

	private static final long serialVersionUID = -2753880249183269771L; //identificador de la serialización

	@Value("${factura.descripcion}")
	public String descripcion;
	
	@Autowired
	private Cliente cliente;
	
	
	@Autowired
	@Qualifier("ItemFacturaOficina") //porque hay dos beans con itemsFacturaOficina
	private List<ItemFactura> items;
	
	@PostConstruct // se ejecuta justo despues de que se haya creadso el objeto e inyectado las dependencias
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("José"));
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
	}
	
	@PreDestroy
	public void destruir() { //nunca va a pasar porque es singleton y dura l oque dura nuestra aplicación arriba y hasta que le damos de baja en el servidor
		
		
	System.out.println("Factura destruida : ".concat(descripcion));
	}

	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
