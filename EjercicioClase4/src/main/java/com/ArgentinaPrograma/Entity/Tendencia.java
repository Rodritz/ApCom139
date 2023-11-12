package com.ArgentinaPrograma.Entity;

public class Tendencia implements Popularidad{
    @Override
    public Icono getIcono() {

        return new Icono(new int[]{0xD83D, 0xDD25});
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return cancion.getTitulo()+cancion.getArtista()+cancion.getAlbum();
    }

    @Override
    public void cambiarEstado(Cancion cancion) {
        if(cancion.getReproduccion()==0){
            cancion.setPopularidad(new Normal());
        }
    }

}
