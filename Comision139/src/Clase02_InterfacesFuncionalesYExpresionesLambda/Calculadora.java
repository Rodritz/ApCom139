package Clase02_InterfacesFuncionalesYExpresionesLambda;

public class Calculadora {
    public double suma(double x, double y){
        Operacion op = (n1,n2) -> n1+n2;
        return op.calcular(x,y);
    }

    public double restar(double x, double y){
        Operacion op = (n1,n2) -> n1-n2;
        return op.calcular(x,y);
    }
    /*
    public double operar(double x, double y){
        Operacion op = (n1,n2) -> n1+n2;
        return op.calcular(x,y);
    }

    public double dividir(double x, double y){
        Operacion op = (n1,n2) -> {
            if(n2!=0){
                return n1/n2;
            }else{
                System.err.println("No se puede dividir por cero");
                return 0.0;
            }

        };
        return op.calcular(x,y);
    }

    */



}
