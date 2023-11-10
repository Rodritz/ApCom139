package Clase01;

//public class Main {
//    public static void main(String[] args) {
//
//        Persona persona1 = new Persona();
//        persona1.setNombre("Soledad");
//    }
//
//}

class Inmueble {
    static int valorMinimo = 100;
}

class Casa {
    static int valorMinimo = 100; // Nueva instancia de valorMinimo para Casa
}

class PH {
    static int valorMinimo = 100; // Nueva instancia de valorMinimo para PH
}

public class Main {
    public static void main(String[] args) {
        // Acceder a la variable de clase a través de la clase base
        System.out.println("Valor mínimo de Inmueble: " + Inmueble.valorMinimo);

        // Crear instancias de las clases derivadas
        Casa casa = new Casa();
        PH ph = new PH();

        // Acceder a la variable de clase a través de las instancias
        System.out.println("Valor mínimo de Casa: " + casa.valorMinimo);
        System.out.println("Valor mínimo de PH: " + ph.valorMinimo);

        // Modificar la variable de clase a través de una instancia
        ph.valorMinimo = 150;

        // Ver los valores después del cambio
        System.out.println("Valor mínimo de Inmueble: " + Inmueble.valorMinimo);
        System.out.println("Valor mínimo de Casa: " + casa.valorMinimo);
        System.out.println("Valor mínimo de PH: " + ph.valorMinimo);
    }
}