import java.util.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class GestorCorrida{

  private Cronometro cronometro;
  private ArrayList<Corredor> corredores;
  private ArrayList<String> resultados;

  public GestorCorrida(Cronometro cronometro, ArrayList<Corredor> corredores){
    this.cronometro = cronometro;
    this.corredores = corredores;
    this.resultados = new ArrayList<String>();
  }

  public void saveCorredor(String id) {
    resultados.add(id);
  }

  public Corredor retornaCorredorPorId(String id) {
    Corredor corredor = null;

    for(Corredor c : corredores){
      if(id.equals(c.id)) {
        corredor = c;
      }
    }
    return corredor;
  }

  public void resultado() {

    try {
      PrintWriter writer = new PrintWriter("resultado.txt", "UTF-8");
      String primeiroLugar = resultados.get(0);
      String segundoLugar = resultados.get(1);
      int posicao = 1;
      for(String r : resultados){
        Corredor c = retornaCorredorPorId(r);
        writer.println("Colocado número: "+posicao);
        writer.println(c.nome);
        posicao += 1;
      }
      writer.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }
}
