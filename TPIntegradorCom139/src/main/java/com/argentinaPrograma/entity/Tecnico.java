package com.argentinaPrograma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tecnico {

    private Long id;
    private String nombre;
    private ArrayList<Servicio> especialidad;
    private ArrayList<Incidente> incidente;
    private ArrayList<Notificacion> medioDeNotificacion;



}
