import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Comparator;

public class NovosRecursos {

  public static void main(String... args) throws Exception{
    List<String> palavras = new ArrayList<>();
    palavras.add("alura online");
    palavras.add("casa do código");
    palavras.add("caelum");

    /*
    1 opção: Pode ser criar uma classe que implementa a interface Consumer
    */
    //ComparadorPorTamanho comparador = new ComparadorPorTamanho();
    //palavras.sort(comparador);

    /*
    2 opção: passar diretamente no sort o Comparator
    */
    /*palavras.sort(new Comparator<String>() {
          @Override
          public int compare(String s1, String s2) {
              if (s1.length() < s2.length())
                  return -1;
              if (s1.length() > s2.length())
                  return 1;
              return 0;
          }
      });
      */

    /*
    3 opção: usar lambda verboso
    */
    /*palavras.sort((String s1, String s2) -> {
          if (s1.length() < s2.length())
              return -1;
          if (s1.length() > s2.length())
              return 1;
          return 0;
    });*/

    /*
    4 opção: usar lambda menos verboso
    */
    /*palavras.sort((String s1, String s2) -> {
          return Integer.compare(s1.length(), s2.length());
    });*/

    /*
    4 opção: usar lambda simples
    */
    palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));

    System.out.println(palavras);

    /*
    1 opção: Pode ser criar uma classe que implementa a interface Consumer
    */
    //Consumer<String> consumidor = new ImprimeNaLinha();

    /*
    2 opção:Criação da classe anonima. Usado quando não se vai reaproveitar
      o código definido na classe
    */
    /*Consumer<String> consumidorClasseAnonima = new Consumer<String>(){
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    };
    palavras.forEach(consumidorClasseAnonima);
    */

    /*
    3 opção: passar diretamente no forEach o Consumer
    */
    /*palavras.forEach(new Consumer<String>(){
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
     });*/

     /*
     4 opção: usar lambda verboso
     */
     /*palavras.forEach((String s) -> {
         System.out.println(s);
     });
     */

     /*
     5 opção: usar lambda simples
     */
     palavras.forEach(s -> System.out.println(s));
  }

}

class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}

class ImprimeNaLinha implements Consumer<String>{
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
