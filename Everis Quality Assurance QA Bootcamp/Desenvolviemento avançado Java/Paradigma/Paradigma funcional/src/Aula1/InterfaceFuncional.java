package Aula1;

public class InterfaceFuncional {

    public static void main(String[] args){

        //funcao1 gerarUmaSaoda = valor -> valor;  //lambida

        funcao1 funcao1 = valor -> valor;


    }

    @FunctionalInterface  //potegendo interface de auteracoes
    interface  funcao1 {
        String gerar(String valor);


    }

}
