package com.example.parcial2.modelos;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cines")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "nit", length = 20, nullable = false)
    private String nit;

    @OneToOne(mappedBy = "cine")
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine")
    private List<Sala> salas = new ArrayList<>();

    public Cine() {
    }

    public Cine(Integer id, String nombre, String nit, DetalleCine detalle, List<Sala> salas) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.detalle = detalle;
        this.salas = salas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public DetalleCine getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}
