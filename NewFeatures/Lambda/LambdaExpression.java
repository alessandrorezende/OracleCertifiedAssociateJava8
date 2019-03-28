import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpression {

  public static void main(String []args){
      List<Water> listWater = new ArrayList<Water>();
      listWater.add(new Water("Fonte nova lima"));
      listWater.add(new Water("Fonte nova esperanca"));
      listWater.add(new Water("Fonte verde"));

      System.out.println("Not Sorted:" + listWater);
      //ordenação alfabetica

      //1 opcao - chamando a classe com o algoritmo de ordenação
      //listWater.sort(new WaterSort());

      //2 opcao - classe interna anonima
      /*
        Comparator<Water> waterSort2 = new Comparator<Water>() {
            @Override
            public int compare(Water w1, Water w2){
               return w1.getSource().compareTo(w2.getSource());
            }
        };
        listWater.sort(waterSort);
      */

      //3 opcao - usando lambda com a interface funcional Comparator
      /*
      Comparator<Water> waterSort3 = (Water w1, Water w2) -> w1.getSource().compareTo(w2.getSource());
      Collections.sort(listWater, waterSort3);
      */

      //4 opcao - simplificando o codico com Lambda usando o Comparator.comparing
      listWater.sort(Comparator.comparing(w -> w.getSource()));


      System.out.println("Sorted:" + listWater);
  }
}

//classe com o algoritmo de ordenação
class WaterSort implements Comparator<Water>{
  @Override
  public int compare(Water w1, Water w2){
     return w1.getSource().compareTo(w2.getSource());
  }
}

class Water {
  private String source;

  public Water(String source){
    this.source = source;
  }
  public String getSource(){
    return this.source;
  }
  public void setSource(String source){
    this.source = source;
  }
  @Override
  public String toString(){
      return source;
  }
}
