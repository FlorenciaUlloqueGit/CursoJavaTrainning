package com.example.demo.Models;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class Producto {

    @Id
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private List <String> listaComentarios;

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

    public List<String> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(List<String> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public Producto(int id, String nombre, String descripcion, float precio, List<String> listaComentarios) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.listaComentarios = new ArrayList<>();
    }

    public Producto( String nombre, String descripcion, float precio, List<String> listaComentarios) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.listaComentarios =  new ArrayList<>();
    }



    public Producto() {
    }

}
