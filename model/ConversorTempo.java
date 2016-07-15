class ConversorTempo  {
  public int ms;

  public ConversorTempo() {
    this.ms = 15555555;
  }


  public String converter(int n) {
    int milesimos = n % 1000;
    int segundos = ( n / 1000 ) % 60;
    int minutos  = ( n / 60000 ) % 60;
    int horas    = n / 3600000;
    return horas+" h "+minutos+" min "+segundos+" s "+milesimos+ " ms";
  }
}
