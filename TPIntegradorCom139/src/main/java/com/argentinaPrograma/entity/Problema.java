package com.argentinaPrograma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problema {

    private Long id;
    private String nombre;
    private boolean esComplejo;
}
