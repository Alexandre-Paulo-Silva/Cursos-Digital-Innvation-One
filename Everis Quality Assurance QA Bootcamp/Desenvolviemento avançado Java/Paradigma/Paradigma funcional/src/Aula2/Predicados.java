package Aula2;
import java.util.function.Predicate;
public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio1 = valor -> valor.isEmpty();
        Predicate<String> estaVazio2 = String::isEmpty;
        Predicate<String> estaVazio3 = valor -> {
          return valor.isEmpty();
        };


        System.out.println(estaVazio1.test(""));
        System.out.println(estaVazio1.test("Joao"));

        System.out.println(estaVazio2.test(""));
        System.out.println(estaVazio2.test("Alexandre"));

        System.out.println(estaVazio3.test("Paulo"));
        System.out.println(estaVazio3.test(""));



    }
}
