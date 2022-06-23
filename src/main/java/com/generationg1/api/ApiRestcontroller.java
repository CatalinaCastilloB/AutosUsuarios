package com.generationg1.api;


import com.generationg1.models.Auto;
import com.generationg1.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/** los metodos deben retornar algo, en los controles solo retorna un string*/
@RestController
@RequestMapping("/api")
public class ApiRestcontroller {

    //inyeccion de dependencias: para usar metodos
    @Autowired
    AutoService autoService;


    //fechas Date no salen por que no tienen gatter y setter
    @RequestMapping("/obtener/autos")
    public List<Auto> obtenerListaAutos(){
        List<Auto> listaAuto = autoService.findAll();
        return listaAuto;
    }

    //SE RETORNA UN API (DOCUMENTO .JSON)

}
