package com.generationg1.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ParametrosRestController {

    //localhost:9080/api?fecha=20220613

    @RequestMapping("/") //se busca capturar un valor y "ponerlo" en el link?
    public String fecha(@RequestParam(value="fecha") String fecha){ //aqui pongo la variable que quiero capturar
        return("La fecha es: " + fecha);
    }


    //localhost:9080/api/seccion?modulo=3&seccion=5
    @RequestMapping("/seccion")
    public String seccion(@RequestParam(value="modulo") String modulo, @RequestParam(value="seccion") String seccion) {

        return "El modulo es: " + modulo + "\nla seccion es: " +seccion;
    }

    //request sin parametros obligatorio
    @RequestMapping("/date")
    public String capturarParametros(@RequestParam(value="anio", required= false) String anio, @RequestParam(value="mes", required= false) String mes, @RequestParam(value="dia", required= false) String dia) {
        if(anio != null){
            System.out.println("el año es: "+anio);
        }if(mes!= null){
            System.out.println("el mes es: " + mes);
        }if(dia!=null){
            System.out.println("el dia es: " + dia);
        }
        return "";

    }


}
