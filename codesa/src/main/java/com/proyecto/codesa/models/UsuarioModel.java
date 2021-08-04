package com.proyecto.codesa.models;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="activo")
	private char activo;
	
	@ManyToOne
	@JoinColumn(name="idRol")
	private RolModel rol;
	
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
	public RolModel getRol() {
		return rol;
	}
	public void setRol(RolModel rol) {
		this.rol = rol;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", activo=" + activo + ", idRol=" + rol + "]";
	}
	
}
