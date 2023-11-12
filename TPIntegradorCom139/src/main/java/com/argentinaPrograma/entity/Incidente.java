package com.argentinaPrograma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Incidente {

    private Long id;
    private Cliente cliente;
    private ArrayList<Servicio> servicio;
    private Problema Problema;
    private Tecnico tecnicoAsignado;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaResolucion;
    private EstadoIncidente estado;

}
