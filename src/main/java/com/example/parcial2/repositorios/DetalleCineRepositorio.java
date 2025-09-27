package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleCineRepositorio extends JpaRepository<DetalleCine, Integer> {

    List<DetalleCine> findByCiudad(String ciudad);

    DetalleCine findByTelefono(String telefono);
}
