package com.generationg1.services;

import com.generationg1.models.Licencia;
import com.generationg1.repositories.LicenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenciaService {

    @Autowired
    LicenciaRepository licenciaRepository;

    public void save(Licencia licencia) {licenciaRepository.save(licencia);}
    public List<Licencia> findAll(){return licenciaRepository.findAll();}

}
