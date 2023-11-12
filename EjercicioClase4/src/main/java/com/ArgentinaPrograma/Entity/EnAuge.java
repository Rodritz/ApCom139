package com.ArgentinaPrograma.Entity;

public class EnAuge implements Popularidad{
    @Override
    public Icono getIcono() {

        return new Icono(new int[]{0xD83D, 0xDE80});
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return cancion.getArtista()+cancion.getTitulo()+cancion.getAlbum();
    }

    @Override
    public void cambiarEstado(Cancion cancion) {
        if(cancion.getReproduccion()>50000&&cancion.getLike()>20000){
            cancion.setPopularidad(new Tendencia());
        }
        if(cancion.getDislike()>5000){
            cancion.setPopularidad(new Normal());
        }
    }


}
