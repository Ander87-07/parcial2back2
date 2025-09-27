package com.example.parcial2.mapas;


import com.example.parcial2.dtos.CineDto;
import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.Sala;

import java.util.List;
import java.util.stream.Collectors;

public interface CineMapa {

   public static CineDto toDTO(Cine cine){
       if (cine == null){
           return null;
       }

       List<String> salas = cine.getSalas() != null
               ? cine.getSalas().stream()
               .map(Sala::getNumero)
               .map(String::valueOf)
               .collect(Collectors.toList())
               : null;

       return new CineDto(
               cine.getId(),
               cine.getNombre(),
               cine.getNit(),
               cine.getDetalle() != null ? cine.getDetalle().getCiudad() : null,
               salas
       );

   }
}
