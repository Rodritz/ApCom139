package com.ArgentinaPrograma.Entity;

public interface Popularidad {

    public abstract Icono getIcono();
    public abstract String getLeyenda(Cancion cancion);
    public abstract void cambiarEstado(Cancion cancion);

}
