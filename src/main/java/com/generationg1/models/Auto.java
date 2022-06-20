package com.generationg1.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Autos")
public class Auto {

    /** Atributos**/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;
    private Boolean dobleCabina;
    private Boolean macanico;
    private String tipoAutomovil;
    private String traccion;
    private String duenio;
    @NotNull()
    private Integer anio;
    @NotNull()
    private String marca;
    @NotNull()
    private String modelo;
    private String nombre;



    /**Constructores*/
    public Auto() {
    }

    public Auto(String color, Boolean dobleCabina, Boolean macanico, String tipoAutomovil, String traccion, String duenio, Integer anio, String marca, String modelo, String nombre) {
        this.color = color;
        this.dobleCabina = dobleCabina;
        this.macanico = macanico;
        this.tipoAutomovil = tipoAutomovil;
        this.traccion = traccion;
        this.duenio = duenio;
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.nombre = nombre;
    }

    public Auto(Integer anio, String marca, String modelo) {
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
    }


    /**getter and setter**/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getDobleCabina() {
        return dobleCabina;
    }

    public void setDobleCabina(Boolean dobleCabina) {
        this.dobleCabina = dobleCabina;
    }

    public Boolean getMacanico() {
        return macanico;
    }

    public void setMacanico(Boolean macanico) {
        this.macanico = macanico;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
