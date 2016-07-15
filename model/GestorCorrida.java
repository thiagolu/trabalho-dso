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
    resultados.add("1");
    System.out.println(resultados);
  }

  public void saveCorredorDois(){
    resultados.add("2");
    System.out.println(resultados);
  }

  public void saveCorredorTres(){
    resultados.add("3");
    System.out.println(resultados);
  }

  public void saveCorredorQuatro(){
    resultados.add("4");
    System.out.println(resultados);
  }

  public void saveCorredorCinco(){
    resultados.add("5");
    System.out.println(resultados);
  }


  public void saveCorredorSeis(){
    resultados.add("6");
    System.out.println(resultados);
  }


  public void saveCorredorSete(){
    resultados.add("7");
    System.out.println(resultados);
  }

  public void resultado(HashMap<String, ArrayList<String>> lista) {
    String primeiroLugar = resultados.get(0);
    String segundoLugar = resultados.get(1);

    for(Corredor c : corredores){
      String idCorredor = c.id.replace("\"", "");
      if(primeiroLugar.equals(idCorredor)) {
        System.out.println("Primeiro Lugar"+c.nome);
      } else if (segundoLugar.equals(idCorredor)) {
        System.out.println("Segundo Lugar"+c.nome);

      }
    }
  }
}
