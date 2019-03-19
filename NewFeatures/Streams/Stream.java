import java.util.*;

public class Stream {
  //Streams: trabalhando melhor com coleções
  public static void main(String... args){
      List<Curso> cursos = new ArrayList<Curso>();
      cursos.add(new Curso("Python",45));
      cursos.add(new Curso("Javascript",150));
      cursos.add(new Curso("Java 8",113));
      cursos.add(new Curso("C",55));

      /*
      *Curso::getNrAlunos (method references)
      */
      //cursos.sort(Comparator.comparing(Curso::getNrAlunos));

      /*
      *comparingInt não faz o autoboxing que é a
      *conversão automática de tipos de dados primitivos em seu objeto equivalente
      *que em iterações grandes reduz o desempenho

      autoboxing: Integer integer = 9;
      unboxing: int in = new Integer(9);
      */
      //cursos.sort(Comparator.comparingInt(Curso::getNrAlunos));

      /*
      *c -> System.out.println(c.getNome()) (Lambda)
      */
      //cursos.forEach(c -> System.out.println(c.getNome()));

      //Usando Streams
      cursos.stream()
        .filter(c -> c.getNrAlunos() >= 100)
        .map(Curso::getNrAlunos)
        .forEach(System.out::println);

        //Usando Stream para obter a soma do numero de alunos dos cursos com mais de 100 alunos
      int soma = cursos.stream()
          .filter(c -> c.getNrAlunos() >= 100)
          .mapToInt(Curso::getNrAlunos)
          .sum();
      System.out.println(soma);

  }

}

class Curso{
  String nome;
  int    nrAlunos;

  Curso(String nome, int nrAlunos){
      this.nome = nome;
      this.nrAlunos = nrAlunos;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public int getNrAlunos(){
    return this.nrAlunos;
  }

  public void setNrAlunos(int nrAlunos){
    this.nrAlunos = nrAlunos;
  }

}
