package Aula1;

import java.util.function.UnaryOperator;
public class Funcional {

    public static void main (String[] args){

        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor*3; //conseito de paradigma funcional

        int valor = 10;

        System.out.println("O resultado e :: "+calcularValorVezes3.apply(10));
    }
}
