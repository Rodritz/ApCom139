package com.ArgentinaPrograma.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Cancion {

    private String titulo;
    private String artista;
    private String album;
    private Popularidad popularidad;
    private int reproduccion;
    private int like;
    private int dislike;

    public String toString(){

        return  popularidad.getIcono()+popularidad.getLeyenda(this);
    }

    public void cambiarPopularidad() {
        this.getPopularidad().cambiarEstado(this);
    }
}
