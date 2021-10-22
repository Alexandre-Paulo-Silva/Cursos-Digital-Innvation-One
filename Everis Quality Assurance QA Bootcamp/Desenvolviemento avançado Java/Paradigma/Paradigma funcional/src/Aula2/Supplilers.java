package Aula2;

import java.util.function.Supplier;

public class Supplilers {

    public static void main(String[] args) {

    }
}

    class Pessoa {
        private String nome;
        private Integer idade;

        public Pessoa(){
            nome = "Alexandre";
            idade = 23;

        }

        @Override
        public String toString(){
            return String.format("nome: %s, idade: %d", nome,idade);
        }


}
