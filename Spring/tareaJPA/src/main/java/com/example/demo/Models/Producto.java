package com.example.demo.Models;
import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.io.Serializable;


@Entity
@Table(name = "productos")
public class Producto implements Serializable {

  
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String descripcion;
    @NotNull
    private float precio;
   
    @NotEmpty
    @Column(name = "listado_comentarios")
    private String listadoComentarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    
	@PostConstruct // se ejecuta justo despues de que se haya creadso el objeto e inyectado las dependencias
	public void inicializar() {
		
		System.out.println("Se inicializaron correctamente los productos");
	}
    


    public Producto(@NotEmpty String nombre, @NotEmpty String descripcion, @NotNull float precio,
			@NotEmpty String listadoComentarios) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.listadoComentarios = listadoComentarios;
	}

	public Producto(int id, @NotEmpty String nombre, @NotEmpty String descripcion, @NotNull float precio,
			@NotEmpty String listadoComentarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.listadoComentarios = listadoComentarios;
	}

	public String getListadoComentarios() {
		return listadoComentarios;
	}

	public void setListadoComentarios(String listadoComentarios) {
		this.listadoComentarios = listadoComentarios;
	}

	public Producto() {
    }

}
