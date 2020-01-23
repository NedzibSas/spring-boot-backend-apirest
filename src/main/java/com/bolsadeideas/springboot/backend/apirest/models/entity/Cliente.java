package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity // para declarar que es una clase entidad
@Table(name = "cliente") // para declarar que es una tabla y su nombre
public class Cliente implements Serializable {

	@Id // indica que es la llave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indicar la estrategia de generacion
	private Long id;
	// se podria poner @Column para indicar el nombre de las columnas pero en este
	// caso tendra el mismo nombre de los datos
	private String nombre;
	private String apellido;
	private String email;

	@Column(name = "create_at") // en este caso si queremos que este campo se llame distinto
	@Temporal(TemporalType.DATE) // para indicar la transformacion o el tipo equivalente en la DB
	private Date createAt;

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

	private static final long serialVersionUID = 1L;
}
