import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


class CSVParser {
  private BufferedReader arquivoCSV;

  public CSVParser() {
    this.arquivoCSV = null;
  }

  public void parsearConteudoComVirgula(String caminhoArquivo){
    String linha = "";
    String separadorCSV = ",";
    HashMap<String, String[]> hm = new HashMap<String, String[]>();

    try {
      this.arquivoCSV = new BufferedReader(new FileReader(caminhoArquivo));

      while ((linha = this.arquivoCSV.readLine()) != null) {
        String[] corredores = linha.split(separadorCSV);
        String nome = corredores[0];
        String idade = corredores[1];
        hm.put(corredores[2], corredores);
        System.out.println("Nome [nome= " + corredores[0]+ " , idade=" + corredores[1] + "]");
      }
      System.out.println(hm.entrySet());
      System.out.println(hm);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (arquivoCSV != null) {
        try {
          arquivoCSV.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}
