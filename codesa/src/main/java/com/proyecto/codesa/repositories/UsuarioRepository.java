package com.proyecto.codesa.repositories;

import org.springframework.data.repository.CrudRepository;
import com.proyecto.codesa.models.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}

