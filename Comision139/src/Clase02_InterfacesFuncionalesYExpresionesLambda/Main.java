package Clase02_InterfacesFuncionalesYExpresionesLambda;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double rta = c.restar(2.0, 3.0);
        System.out.println(rta);

        Nombre nombre = new Nombre();
        System.out.println(nombre.formateo("sole", (cad) -> cad.toUpperCase()));
        System.out.println(nombre.formateo("SOLE", (cad) -> cad.toLowerCase()));
        System.out.println(nombre.formateoComplicado("palabra"));
        System.out.println(nombre.formateo("Soledad", (cad) -> cad.toUpperCase() + "\n" + cad.toLowerCase()));
    }
}
