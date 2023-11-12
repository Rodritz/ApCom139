package com.ArgentinaPrograma.Entity;

public class Normal implements Popularidad{

    @Override
    public Icono getIcono() {

        return new Icono(new int[]{0xD83C, 0xDFB5});
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return cancion.getArtista()+cancion.getAlbum()+cancion.getTitulo();
    }

    @Override
    public void cambiarEstado(Cancion cancion) {
        if(cancion.getReproduccion()>1000){
            cancion.setPopularidad(new EnAuge());
        }
    }

}
