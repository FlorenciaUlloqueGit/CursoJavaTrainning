package com.bolsadeideas.springboot.empleado.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // anotación para llamar JPA
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // hace al id autoincremental y busca en la DB uno autoincremental
	private Long id;
	private String nombre;
	private String apellido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getResourceId() { //para mostrar el id en postman como otra variable más y no que aparezca hidden
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
