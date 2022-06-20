package com.generationg1.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class EnrutamientoRestController {

    /**
     * Enrutamientos
     */
    // http://localhost:9080/usuario
    @RequestMapping("/usuario") // Anotacion para capturar las rutas
    public String usuario() {
        return "estamos en la url usuario";
    }

    // http://localhost:9080/usuario
    @RequestMapping("/usuario/inscrito") // Anotacion para capturar las rutas
    public String inscrito() {
        return "estamos en la url usuario";
    }

    @RequestMapping(value = "/proveedor/registrado", method= RequestMethod.GET)
    public String proveedor() {
        return "estamos en la url proovedor";
    }
}
