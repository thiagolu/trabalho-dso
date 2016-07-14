import java.util.*;

public class GestorCorrida{

  private Cronometro cronometro;
  private ArrayList<Corredor> corredores;
  private ArrayList<String> resultados;



  public GestorCorrida(Cronometro cronometro, ArrayList<Corredor> corredores){
    this.cronometro = cronometro;
    this.corredores = corredores;
    this.resultados = new ArrayList<String>();
  }

  public void saveCorredorUm(){
    resultados.add(0, corredores.get(0).nome);
    System.out.println(resultados);
  }

  public void saveCorredorDois(){
    resultados.add(0, corredores.get(1).nome);
    System.out.println(resultados);
  }

  public void saveCorredorTres(){
    resultados.add(0, corredores.get(2).nome);
    System.out.println(resultados);
  }

  public void saveCorredorQuatro(){
    resultados.add(0, corredores.get(3).nome);
    System.out.println(corredores);
  }

}
