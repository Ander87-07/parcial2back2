package com.example.parcial2.servicios;


import com.example.parcial2.modelos.Cine;
import com.example.parcial2.repositorios.CineRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CineServicios {

    private final CineRepositorio cineRepositorio;

    public CineServicios(CineRepositorio cineRepositorio) {
        this.cineRepositorio = cineRepositorio;
    }

    public Cine guardar(Cine cine){
        return cineRepositorio.save(cine);
    }
}
