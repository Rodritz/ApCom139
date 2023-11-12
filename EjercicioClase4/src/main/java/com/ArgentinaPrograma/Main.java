package com.ArgentinaPrograma;

import com.ArgentinaPrograma.Entity.Cancion;
import com.ArgentinaPrograma.Entity.Normal;


public class Main {
    public static void main(String[] args) {

        Cancion cancion = new Cancion();
        cancion.setPopularidad(new Normal());
        cancion.cambiarPopularidad();
    }
}