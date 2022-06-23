package com.generationg1.models;

import java.util.Date;

import javax.persistence.*;

//Modelo Licencia de conducir

@Entity
@Table(name="licencias")
public class Licencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numero;
    private Date fechaVencimiento;
    private String clase;
    private String estado;




    //Constructor vacio
    public Licencia() {
        super();
    }

    //Constructor con parametros
    public Licencia(Long id, Integer numero, Date fechaVencimiento, String clase, String estado) {
        super();
        this.id = id;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.clase = clase;
        this.estado = estado;
    }

    //opcionales, sirven para la gestion de la base dato
    @Column(updatable = false)//esta columna especifica nunca se va a actualizar atravez del sistema
    private Date createdAt;//Para saber en que momento fue insertada en la base de datos

    private Date updatedAt;//Para cuando se actualizo
    //private Date deletedAt;//Fecha de eliminacion logica, no borramos el registro solo lo damos de baja


    //Relaciones one to one (1a1)
    @OneToOne(fetch = FetchType.LAZY)
    //eager busca todas las relaciones que exiten
    //lazy solo busca una relacion cuando se le especifica

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //inserta en el atributo la fecha antes de registrar en la base de datos
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

}
