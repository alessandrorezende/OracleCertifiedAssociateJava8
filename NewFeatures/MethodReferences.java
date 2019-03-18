import java.util.*;

public class MethodReferences {

  public static void main(String... args){
    List<String> palavras = new ArrayList<>();
    palavras.add("alura online");
    palavras.add("casa do código");
    palavras.add("caelum");

    /*
    1 opção: usar lambda simples
    */
    //palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));

    /*
    2 opção: usar lambda em method references
    */
    //palavras.sort(Comparator.comparing(s -> s.length()));
    palavras.sort(Comparator.comparing(String::length));

    /*
    4 opção: usar lambda em method references (Forma Verbosa)
    */
    /*
    Function<String, Integer> funcao = s -> s.length();
    //equivalente ao de cima
    //chama-se method reference a forma abaixo
    Function<String, Integer> funcao = String::length;

    Comparator<String> comparador = Comparator.comparing(funcao);
    palavras.sort(comparador);
    */

    System.out.println(palavras);
    
    //usando method reference
    //o method reference eh avalidado como uma função lambda
    palavras.forEach(System.out::println);


  }



}
