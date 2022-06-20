package com.generationg1.services;

import com.generationg1.models.Auto;
import com.generationg1.models.Usuario;
import com.generationg1.repositories.AutoRepository;
import com.generationg1.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class AutoService {

    @Autowired
    AutoRepository autoRepository;
     public void saveAuto(Auto auto) {
        autoRepository.save(auto);
    }

    public List<Auto> findAll(){
        return autoRepository.findAll();
    }

    public Auto buscarID(Long id){
         return autoRepository.findById(id).get();
    }

    public void eliminarId(Long id){
        autoRepository.deleteById(id);
    }


}
