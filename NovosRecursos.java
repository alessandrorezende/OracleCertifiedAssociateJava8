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

    ComparadorPorTamanho comparador = new ComparadorPorTamanho();
    palavras.sort(comparador);
    System.out.println(palavras);

    /*
    Pode ser criar uma classe que implementa a interface Consumer
    ou criar uma classe anonima.
    */
    Consumer<String> consumidor = new ImprimeNaLinha();

    /*Criação da classe anonima. Usado quando não se vai reaproveitar 
      o código definido na classe
    */
    Consumer<String> consumidorClasseAnonima = new Consumer<String>(){
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    };

    palavras.forEach(consumidorClasseAnonima);
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
