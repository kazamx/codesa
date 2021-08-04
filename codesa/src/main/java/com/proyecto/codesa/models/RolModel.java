package com.proyecto.codesa.models;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RolModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long idRol;
	
	@Column(name="nombre")
	private String nombreRol;
	
	public Long getIdRol() {
		return idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	@Override
	public String toString() {
		return "Rol [id=" + idRol + ", nombre=" + nombreRol + "]";
	}
	
}
