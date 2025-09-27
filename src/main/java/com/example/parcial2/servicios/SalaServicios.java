package com.example.parcial2.servicios;


import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.Sala;
import com.example.parcial2.repositorios.CineRepositorio;
import com.example.parcial2.repositorios.SalaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class SalaServicios {
   private final SalaRepositorio salaRepositorio;

    public SalaServicios(SalaRepositorio salaRepositorio) {
        this.salaRepositorio = salaRepositorio;
    }

    public Sala guardar(Sala sala){
        return salaRepositorio.save(sala);

    }
}
