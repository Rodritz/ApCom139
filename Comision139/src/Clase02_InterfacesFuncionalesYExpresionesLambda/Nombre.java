package Clase02_InterfacesFuncionalesYExpresionesLambda;

public class Nombre {
    public String formateo(String cadena,Formateo f){
        return f.formatear(cadena);
    }

    public String formateoComplicado(String cadena){
        Formateo f = (cad) -> {
            if(cad.length()>4){
                return cad.toUpperCase();
            }else{
                return cad.toLowerCase();
            }
        };

        return f.formatear(cadena);

    }

//    public String formateoMinuscula(String cadena){
//        Formateo f = (cad) -> cad.toLowerCase();
//        return f.formatear(cadena);
//    }

}
