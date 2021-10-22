package strings;

public class Strings {

  public static void main(String[] args) {

    var nome = "André";
    var sobreNome = "Gomes";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto); //concatenando
    var string = new String(" Minha  String ");

    System.out.println("Char na posição : " + string.charAt(5)); //posicao da string
    System.out.println("Quantidade=" + string.length()); //tamanho da string
    System.out.println("Sem Trim [" + string + "]"); //tirar caracteres em branco
    System.out.println("Com Trim [" + string.trim() + "]"); // matem caracteres em branco
    System.out.println("Lower " + string.toLowerCase()); // tudo maisculo
    System.out.println("Upper " + string.toUpperCase()); // tudo minusculo
    System.out.println("Contém M? " + string.contains("M")); // contem a string na retorna true e false
    System.out.println("Contém X? " + string.contains("X")); //
    System.out.println("Replace " + string.replace("n", "$")); //trocar string n por $
    System.out.println("Equals? " + string.equals(" Minha String ")); // comparando strings
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG ")); //iguinora se
    System.out.println("Substring(1,6)=" + string.substring(1, 6)); //pegado strings diacordo com o posicionamento

  }

}
