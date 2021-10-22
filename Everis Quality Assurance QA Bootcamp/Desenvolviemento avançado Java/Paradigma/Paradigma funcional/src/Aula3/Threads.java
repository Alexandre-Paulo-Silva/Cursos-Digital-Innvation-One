package Aula3;

public class Threads {

    public static void main(String[] args) {

    }
}

class GerarPDF implements Runnable{
    @Override
    public void run(){
        System.out.println("Gerar PDF");
    }
}

class  BarraDeCarregamento implements  Runnable{
    @Override
    public void run() {System.out.println("Loading .......");}
}

class  BarraDeCarramento2 extends Threads{


    public void run(){

        System.out.println("rodei");
    }
}