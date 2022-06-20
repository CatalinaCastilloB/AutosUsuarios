package com.generationg1.controller;

import com.generationg1.models.Usuario;
import org.springframework.stereotype.Controller;//controller importado
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller //importar controller, ruta controlador
public class IndexController {

    //en los parentesis se establece la anotacion para capturar las rutas,1°ruta
    @RequestMapping("/") //vendria siendo localhost (http://localhost:8080/
    public String index(Model model) {
        model.addAttribute("Apellidos", "Castillo Belmar"); //model.addAttribute(attributeName, attributeValue);
        model.addAttribute("edad", 22);
        Usuario usuario = new Usuario("Cata","Castillo", 26, "1234");

        model.addAttribute("Usuario",usuario);

        return "index.jsp"; //abre el archivo index.jsp en la ruta establecida


    }

    // enrutamiento


}