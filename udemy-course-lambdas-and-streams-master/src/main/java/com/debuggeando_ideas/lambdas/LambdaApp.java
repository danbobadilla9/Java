package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.interfaces.Product;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class LambdaApp {

    public static void main(String[] args) {
        // Utilizando una clase anonima
        Math2 substract = new Math2() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };

        Double resta = substract.execute(10.0, 5.0);
        System.out.println("Resta de 10 - 5 es: " + resta);

        Math2 multiply = (a, b) -> a * b;
        Double multiplicacion = multiply.execute(10.0, 5.0);
        System.out.println("La multiplicacion de 10 * 5 es: " + multiplicacion);

        Math2 divide = (a, b) -> {
            System.out.println("Start");
            return a / b;
        };

        Double dividir = divide.execute(10.0, 5.0);
        System.out.println("El resultado de dividir 10 entre 5 es: " + dividir);

        //metodos lambda genericos
        Printer2<String> printString = string -> System.out.println(" Imprimiendo: " + string);
        printString.print(" lambda generico");

        Printer2<Product> printProduct = product -> System.out.println(product);
        Product myProduct = new Product();
        myProduct.setPrice(10.5);
        myProduct.setName("Pluma");
        myProduct.setId(10L);
        printProduct.print(myProduct);

        // utilizando ciclo for con expresiones lambda
        List<String> countries = List.of("Mexico", "Colombia", "Argentina", "Chile", "Uruguay");
        for(String c: countries){
            System.out.println(c);
        }

        // Cualquier coleccion que derive de la interfaz colection nos ofrece elmetodo foreach
        countries.forEach( countri -> System.out.println(countri.toUpperCase()));

        // las expresiones lambda no pueden alterar variables, porque a veces corre en un thread y ncesitamos que sea volatil
        // por lo que deberia ser AtomicInteger para que podamos utilizarla en al thread

        AtomicInteger num = new AtomicInteger(10);
        IntStream.range(1,10).forEach(i -> num.set(num.get()+i));
        System.out.println(num.get());

    }


}
