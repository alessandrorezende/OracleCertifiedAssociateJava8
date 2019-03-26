import java.time.Period;
import java.time.LocalDate;
import java.time.Month;

public class WorkWithPeriod{

  public static void main(String [] args){
      Period p1 = Period.ofYears(1);
      Period p2 = Period.ofMonths(12);
      Period p3 = Period.ofWeeks(52);
      Period p4 = Period.ofDays(366);

      Period p5 = Period.of(1,12,366); // 3 anos

      LocalDate ldt1 = LocalDate.of(2000,Month.JANUARY, 1);
      LocalDate ldt2 = null;

      ldt2 = ldt1.plus(p1).plus(p2).plus(p3).plus(p4).plus(p5);

      System.out.println("Before: " + ldt1 + " After: " + ldt2);

      /*Periodo de 41 anos, 2 meses e 3 dias*/
      Period period1 = Period.parse("P41Y2M3D");
      System.out.println(period1);

      /*Periodo de 4 semanas*/
      Period period2 = Period.parse("P4W");
      System.out.println(period2.getDays() + " days");
      System.out.println(period2.getMonths() + " month");





  }
}
