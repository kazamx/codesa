package com.proyecto.codesa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.codesa.models.RolModel;
import com.proyecto.codesa.models.UsuarioModel;
import com.proyecto.codesa.repositories.RolRepository;
import com.proyecto.codesa.repositories.UsuarioRepository;

@Service
public class RolUsuarioService {

	@Autowired
	RolRepository rolRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	RolUsuarioService rolUsuarioService;

	public ArrayList<RolModel> obtenerRoles(){
		return (ArrayList<RolModel>)rolRepository.findAll();
	}
	
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
	}
	
	public void ingresarDato(UsuarioModel usuarioModel){
		ArrayList<UsuarioModel> listaUsuarios= rolUsuarioService.obtenerUsuarios();
		boolean control = false;
		for(UsuarioModel dato: listaUsuarios) {
			if(dato.getNombre().equals(usuarioModel.getNombre())) {
				control = true;
				System.out.println("El nombre ya existe¡");
				break;
			}
		}
		if(!control) {
			usuarioRepository.save(usuarioModel);
			System.out.println("Dato ingresado correctamente¡");
		}
		
	}
	
	public void eliminarDato(Long id){
		usuarioRepository.deleteById(id);
	}
	
	public void modificarDato(UsuarioModel usuarioModel){
		System.out.println(usuarioModel.toString());
		usuarioRepository.save(usuarioModel);
	}
	
	public Optional<UsuarioModel> getDatoId(Long id) {
		return usuarioRepository.findById(id);
	}

}
