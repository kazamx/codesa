package com.proyecto.codesa.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.codesa.models.UsuarioModel;
import com.proyecto.codesa.services.RolUsuarioService;

@RestController
@RequestMapping("/codesa")
public class RolUsuarioController {

	@Autowired
	RolUsuarioService rolUsuarioService;

	@GetMapping()
	public ArrayList<UsuarioModel> obtenerDatos(){
		return rolUsuarioService.obtenerUsuarios();
	}
	
	@GetMapping(value="/{id}")
	public Optional<UsuarioModel> obtenerDatoId(@PathVariable("id") Long id){
		return rolUsuarioService.getDatoId(id);
	}
	
	@PostMapping(value="/guardar")
	public void ingresarDato(@RequestBody UsuarioModel usuarioModel) {
		usuarioModel.setId(null);
		System.out.println(usuarioModel.toString());
		rolUsuarioService.ingresarDato(usuarioModel);
	}
	
	@DeleteMapping(value="/eliminar/{id}")
	public void eliminarDato(@PathVariable("id") Long id) {
		rolUsuarioService.eliminarDato(id);
	}
	
	@PutMapping(value="/modificar")
	public void modificarDato(@RequestBody UsuarioModel usuarioModel) {
		System.out.println(usuarioModel.toString());
		rolUsuarioService.modificarDato(usuarioModel);
	}
	
}
