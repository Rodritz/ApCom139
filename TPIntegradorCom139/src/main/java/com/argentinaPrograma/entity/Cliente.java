package com.argentinaPrograma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private Long id;
    private String razonSocial;
    private String Cuit;
    private ArrayList<Servicio> servicioContratado;

}
