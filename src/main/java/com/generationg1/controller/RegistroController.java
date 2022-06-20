package com.generationg1.controller;

import com.generationg1.models.Usuario;
import com.generationg1.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    //inyeccion de dependencias, para guardar informacion
    @Autowired
    UsuarioService usuarioService;

    //ruta para desplejar el jsp
    @RequestMapping("")
    public String registro(@ModelAttribute("usuario") Usuario usuari){
        return "Registro.jsp";
    }


    //Captura de datos
    // el formulario request tiene muchas libertades @RequestMapping("/usuario"), asi no pasa informacion por url el usuario

    @PostMapping("/usuario/respaldo") //se retringe la ruta, solo acepta formulario post
    public String registroUsuario(@ModelAttribute("usuario") Usuario usuario){
            //(@RequestParam(value = "NombreIng") String nombre, @RequestParam(value = "ApellidoIng") String apellido, @RequestParam(value = "EdadIng") Integer edad){
        System.out.println("Metodo registro de usuario " + usuario.toString());
        return "Registro.jsp";
    }

    //el bindingresult tiene que ir inmediatamente al lado de donde se encuentra el valid, se guarda el resultado
    //model es quien manda informacion al front end
    @PostMapping("/usuario") //todos los atributos de usuario llenos
    public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
                                 BindingResult resultado, Model model){
        if(resultado.hasErrors()){//se detiene la ejecucion para mostrar mensajes de error, captura si hay un error en el ingreso de datos
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "Registro.jsp";
        }

        //enviar obj al service
        usuarioService.saveUsuario(usuario); //se esta creando un metodo aqui mismo, el programa automaticamente crea el metodo en el archivo de UsusarioService.java


        // obtener una lista de autos
        List<Usuario> listaUsuarios = usuarioService.findAll();
        // Pasamos la lista de auto al jsp
        model.addAttribute("usuariosCapturados", listaUsuarios);


        return "index.jsp";
    }


}
