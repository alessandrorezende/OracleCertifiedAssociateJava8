class Guitar {

  public static void main(String []args){
      //Inclui expressão Lambda
      Strummable instrument = () -> {System.out.println("strummed!");};
      instrument.strum();
  }

  //FI - Interface funcional
  @FunctionalInterface
  interface Strummable {
    //SAM - single abstract method (método abstrato unico)
    void strum();
  }

}
