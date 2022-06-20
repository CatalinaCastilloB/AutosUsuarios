package com.generationg1.services;


import com.generationg1.models.Usuario;
import com.generationg1.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    //interface variableDel repository
    public void saveUsuario(@Valid Usuario usuario) {
        usuarioRepository.save(usuario);


    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    /** logica de negocios o validaciones del sistema **/
    //llamar a repository (parecido a instanciar) inyeccion de dependencia, dependencia de clases
}
