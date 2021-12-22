package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity // para indicar que la clase cliente esta mapeada a una tabla y es una entidad
		// de JPA o Hibernate
@Table(name = "clientes") // para config el nombre de la tabla, es opcional porque si no lo argegamos
							// queda como el nombre de la clase
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// @Column(name = "nombre_cliente")
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String apellido;
	
	@NotEmpty
	@Email
	private String email;
	

	// @Column(name = "create_at")
	
	@Temporal(TemporalType.DATE)
	@NotNull(message="Debe ingresar una fecha") //para campos como date se usa notnull
	@DateTimeFormat(pattern="yyyy-MM-dd") //especificamos el formato de fecha
	private Date createAt;
	
	
	
	
	
	@PrePersist  //antes que se inserte en la base de datos. Se invoca de forma automática justo antes de insertar algo en la base de datos
	public void prePersist() {
		
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
