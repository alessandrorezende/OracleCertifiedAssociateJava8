import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkWithData{

  public static void main(String args []){

    //A API de data e hora faz uso de um design fluente (interface fluente)

    //Usando at - usado para combinar um objeto com outro
    LocalTime lt10 = LocalTime.MIDNIGHT;
    LocalDateTime ldt11 = lt10.atDate(LocalDate.now());
    System.out.println(ldt11);

    //Encadeamento de métodos = Interface fluente
    LocalDateTime ldt = LocalDateTime.now().plusYears(1).plusMonths(2).plusDays(5);

    System.out.println(ldt);
    System.out.println(ldt.getYear());

    //Duração de alguma tarefa
    Duration d = Duration.ofSeconds(2);
    System.out.println(d);
    System.out.println(d.getSeconds());

    //LocalTime l = LocalTime.NOON; // 12:00
    //LocalTime l = LocalTime.MIN; // 00:00
    //LocalTime l = LocalTime.MAX; // 23:59:59.999999999
    LocalTime l = LocalTime.MIDNIGHT; //00:00
    System.out.println(l);

    LocalDate ld = LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_DATE);
    System.out.println(ld);

  }

}
