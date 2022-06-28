package com.generationg1.controller;


import com.generationg1.models.Licencia;
import com.generationg1.models.Usuario;
import com.generationg1.services.LicenciaService;
import com.generationg1.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/licencia")
public class licenciaController {
    @Autowired
    LicenciaService licenciaService;

    @Autowired
    UsuarioService usuarioService;


    @RequestMapping("")
    public String depliegue(Model model){
        Licencia licencia = new Licencia();
        model.addAttribute("licencia",licencia);

        List<Usuario> listaUsuario = usuarioService.findAll();

        model.addAttribute("listaUsuarios", listaUsuario);

        List<Licencia> listaLicencias = licenciaService.findAll();
        model.addAttribute("listaLicencias", listaLicencias);


        return "licencia.jsp";

    }

    @PostMapping("/guardar") //todos los "guardar son con post maping?
    public String guardarLicencia(@Valid @ModelAttribute("licencia") Licencia licencia){
        licenciaService.save(licencia);
        return "licencias.jsp";
    }

    @RequestMapping("/editar/${id}")
    public String editarLicencia(){
        return"";
    }

    @RequestMapping("/delete/${id}")
    public String eliminarLicencia(){
        return"";
    }



}
