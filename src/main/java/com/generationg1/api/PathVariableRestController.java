package com.generationg1.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var")
public class PathVariableRestController{
        @RequestMapping("fecha/{anio}/{mes}/{dia}")
        public String capturarVariablePath(@PathVariable("anio") String anio, @PathVariable("mes") String mes, @PathVariable("dia") String dia){
        //localhost:9080/var/fecha/2023/6/13
        //localhost:9080/var/fecha/{anio}/{mes}/{dia}
        return "la fecha es: "+anio+"/"+mes+"/"+dia;

        }

}
