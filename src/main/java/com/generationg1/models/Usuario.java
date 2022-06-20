package com.generationg1.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity   //transforma el objeto en entidad, de momento trabajaremos con persistence
@Table(name="Usuarios") //diferenciar el obj de la tabla
public class Usuario {

    //atributos

    //PARA BASE DE DATOSS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=3, max=20) // con esta notacion se puede controlar el tamaño del atributo Nombre
    private String Nombre;

    @Size(min=3, max=20)
    private String Apellido;


    private Integer edad;

    @NotNull()
    @Size(min=6, max=8)
    private String password;


    //constructor
    public Usuario(String nombre, String apellido, Integer edad, String password) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.edad = edad;
        this.password = password;
    }


    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario() {
    }

    //getter and setter

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
