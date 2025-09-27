package com.example.parcial2.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "capacidad0", nullable = false)
    private Integer capacidad;
    private String tipo; // 2D, 3D, IMAX...


    @ManyToOne
    @JoinColumn(name = "cine_id", nullable = false)
    private Cine cine;

    public Sala() {
    }

    public Sala(Integer id, Integer numero, Integer capacidad, String tipo, Cine cine) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.cine = cine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}
