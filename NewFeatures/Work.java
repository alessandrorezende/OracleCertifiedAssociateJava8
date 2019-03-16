public class Work {

  public static void main(String [] args){
    //Considere o seguinte código que executa um Runnable em uma Thread:
    new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Executando um Runnable sem lambda");
        }
    }).start();

    //Como podemos escrevê-lo usando a uma expressão lambda?
    new Thread(() -> System.out.println("Executando um Runnable com lambda")).start();
  }

}
