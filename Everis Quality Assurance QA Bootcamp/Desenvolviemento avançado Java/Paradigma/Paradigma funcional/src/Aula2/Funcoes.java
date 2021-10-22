package Aula2;

import  java.util.function.Function;
public class Funcoes {

    public static void main(String[] args) {

        Function<String,String> retornarNomeContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> coverterStringParaInteiro = string -> {
           return Integer.valueOf(string) * 2;
        };
        Function<String,Integer> coverterStringParaInteiroDobro = Integer::valueOf;


        System.out.println(retornarNomeContrario.apply("Alexandre"));
        System.out.println(coverterStringParaInteiro.apply("20"));
    }
}
