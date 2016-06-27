class ConversorTempo  {
  public int ms;

  public ConversorTempo() {
    this.ms = 15555555;
  }


  public String converter(int n) {
    int milesimos = n % 1000;
   int segundos = ( n / 1000 ) % 60;      // se não precisar de segundos, basta remover esta linha.
   int minutos  = ( n / 60000 ) % 60;     // 60000   = 60 * 1000
   int horas    = n / 3600000;            // 3600000 = 60 * 60 * 1000
   return horas+" hh "+minutos+" mim "+segundos+" s "+milesimos+"ms";
  }
}
