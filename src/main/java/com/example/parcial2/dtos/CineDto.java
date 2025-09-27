package com.example.parcial2.dtos;

import java.util.List;

public class CineDto {
    private Integer id;
    private String nombre;
    private String nit;
    private String ciudad;
    private List<String> salas;

    public CineDto() {
    }

    public CineDto(Integer id, String nombre, String nit, String ciudad, List<String> salas) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.ciudad = ciudad;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<String> getSalas() {
        return salas;
    }

    public void setSalas(List<String> salas) {
        this.salas = salas;
    }
}
