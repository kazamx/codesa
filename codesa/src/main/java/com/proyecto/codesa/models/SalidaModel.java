package com.proyecto.codesa.models;

import javax.persistence.Column;

public class SalidaModel {

	private Long id;
	private String nombre;
	private char activo;
	private Long idRol;
	private String nombreRol;
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
	public char getActivo() {
		return activo;
	}
	public void setActivo(char activo) {
		this.activo = activo;
	}
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
		return "SalidaModel [id=" + id + ", nombre=" + nombre + ", activo=" + activo + ", idRol=" + idRol
				+ ", nombreRol=" + nombreRol + "]";
	}
}
