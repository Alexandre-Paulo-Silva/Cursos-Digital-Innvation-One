package Aula2;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        System.out.println(execultarOperacao(soma,1,3));

    }

    public static int execultarOperacao(Calculo calculo, int a, int b){
        return calculo.calculo(a,b);
    }
}
    interface Calculo{
        public int calculo(int a,int b);
    }


