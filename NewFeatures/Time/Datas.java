import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datas {
  //Nova API de datas
  public static void main(String [] args){
      LocalDate hoje = LocalDate.now();
      System.out.println(hoje);

      LocalDate dataFuturo = LocalDate.of(2021, Month.JANUARY, 23);

      int anos = dataFuturo.getYear() - hoje.getYear();
      System.out.println(anos);

      Period periodo = Period.between(hoje,dataFuturo);
      System.out.println(periodo);

      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY");
      String valorFormatado = dataFuturo.format(formatador);
      System.out.println(valorFormatado);

      LocalDateTime agora = LocalDateTime.now();
      DateTimeFormatter formatadorWithTime = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss");
      String agoraFormatado = agora.format(formatadorWithTime);
      System.out.println(agoraFormatado);

      LocalTime horas = LocalTime.of(15,30);
      System.out.println(horas);


  }


}
