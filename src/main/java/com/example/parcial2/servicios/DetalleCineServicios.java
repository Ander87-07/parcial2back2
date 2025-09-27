package com.example.parcial2.servicios;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.repositorios.DetalleCineRepositorio;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineServicios {
    private final DetalleCineRepositorio detalleCineRepositorio;

    public DetalleCineServicios(DetalleCineRepositorio detalleCineRepositorio) {
        this.detalleCineRepositorio = detalleCineRepositorio;
    }

    public DetalleCine guardar(DetalleCine detalleCine){
        return detalleCineRepositorio.save(detalleCine);
    }
}
