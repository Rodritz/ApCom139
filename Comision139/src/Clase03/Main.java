package Clase03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        //forEach es un lambda consumer. Representa una operacion con uno o dos parametros y me devuelve un void
        /*void forEach(Consumer<? super T> action) ;
        @FunctionalInterface
        public interface Consumer<T> {
            void accept(T t);
        }*/
        List<String> listaDeNumeros = Arrays.asList("10", "25", "3", "4");
        //RECORREMOS DE MANERA TRADICIONAL
        /*for (int i = 0; i < listaDeNumeros.size(); i++) {
//            int num = Integer.parseInt(listaDeNumeros.get(i));
//            System.out.println(num+1);
           System.out.println(listaDeNumeros.get(i));
       }*/
        //RECORREMOS CON STREAM
         listaDeNumeros.forEach(numero->System.out.println(numero));
        //SIMPLIFICAMOS EL CODIGO
         listaDeNumeros.forEach(System.out::println);

         //-----------------------------------------------------------------------------

        //anyMatch y allMatch son lambda predicate. Representa una operacion con uno o dos parametros y  siempre me devolvera un boolean
        /*boolean anyMatch(Predicate<? super T> predicate)
        @FunctionalInterface
        public interface Predicate<T> {
            boolean test(T t);
        }*/
       // USAMOS EL ANY QUE DEVUELVE VERDADERO SI ENCUENTRA AL MENOS 1 VALOR VERDADERO
        boolean cond = listaDeNumeros.stream().anyMatch(numero->Integer.parseInt(numero)>0);
        System.out.println(cond);

        boolean cond2 = listaDeNumeros.stream().allMatch(numero -> Integer.parseInt(numero)<25);
        System.out.println(cond2);

        //-------------------------------------------------------------------------------------

        //map es un Lambda Function. recime uno o dos valores y devuelve un resultado
        /*<R> Stream<R> map(Function<? super T, ? extends R> mapper)
        @FunctionalInterface
        public interface Function<T, R> {
            R apply(T t);
        }*/
//MANIPULAMOS LOS DATOS SUMANDOLE 1 A CADA NUMERO
        listaDeNumeros.stream().map(x -> Integer.parseInt(x)+1).forEach(System.out::println);
        List<Integer> lista = listaDeNumeros.stream().map(x -> Integer.parseInt(x)+1).collect(Collectors.toCollection(ArrayList::new));
        lista.add(101);
        lista.forEach(System.out::println);
        listaDeNumeros.stream().mapToInt(numero -> Integer.valueOf(numero)+2).forEach(System.out::println);

        List<Integer> numeros = listaDeNumeros.stream().mapToInt(numero ->
                Integer.valueOf(numero)).boxed().collect(Collectors.toList());
        System.out.println(numeros);

        //-----------------------------------------------------------------------------

        //Collections.min(). recibe una collection, trabaja sobre objetos, no sobre datos primitivos
        List<Integer> listaNumeros = Arrays.asList(10,20,30,5);
        Integer resultadoMin = Collections.min(listaNumeros);
        System.out.println(resultadoMin);

        //Collection.max()
        Integer resultadoMax = Collections.max(listaNumeros);
        System.out.println(resultadoMax);

        //IntStream.sum()
        int suma = listaNumeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println(suma);

        //Collectors.joining()
        List<String> listaDeDatos = Arrays.asList("Sole", "Ana", "Analia", "Andres");
        String textoResultante = listaDeDatos.stream().collect(Collectors.joining(", "));
        System.out.println(textoResultante);

        //-----------------------------------------------------------------------

        //filter
        for(int i = 0; i<listaDeDatos.size();i++){
            if(listaDeDatos.get(i).startsWith("A")){
                System.out.println(listaDeDatos.get(i));
            }
        }
        for (String deDato : listaDeDatos) {
            if (deDato.startsWith("A")) {
                System.out.println(deDato);
            }
        }
        listaDeDatos.stream().filter(listaDeDato -> listaDeDato.startsWith("A")).forEach(System.out::println);
        //FILTRO POR LA PRIMERA LETRA DE CADA CPALABRA
        listaDeDatos.stream().filter((x->x.toUpperCase().startsWith("A"))).forEach(System.out::println);
        //ORDENO EN ORDEN ASCENDENTE
        listaDeDatos.stream().sorted().forEach(System.out::println);
        //ORDENO EN ORDEN DESCENDENTE
        listaDeDatos.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
        ArrayList<String> nuevaLista = listaDeDatos.stream().sorted((x,y)-> y.compareTo(x)).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(nuevaLista);


        /*EJERCICIO 1
        Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
        lista con los strings en mayúscula.*/

        List<String>listaOriginal = List.of("Hola", "Mundo", "en", "Mayuscula");
        List<String> listaEnMayuscula = listaOriginal.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        List<String> listaEnMayuscula1 = listaOriginal.stream().map(String::toUpperCase).toList();
        System.out.println(listaEnMayuscula);
        listaEnMayuscula1.forEach(System.out::println);

        /*EJERCICIO 2
        Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
        método debe devolver un String que concatene separando por coma y espacio todas las
        palabras, en la lista, que tengan más de "n" caracteres.*/

        String masDe4Caracteres = listaOriginal.stream().filter(x -> x.length() > 4).collect(Collectors.joining(", "));
        System.out.println(masDe4Caracteres);

    }
}
