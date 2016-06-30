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

  public HashMap<String, ArrayList<String>> parsearConteudoComVirgula(String caminhoArquivo){
    String linha = "";
    String separadorCSV = ",";
    HashMap<String, ArrayList<String>> cadastroCorredores = new HashMap<String, ArrayList<String>>();

    try {
      this.arquivoCSV = new BufferedReader(new FileReader(caminhoArquivo));

      while ((linha = this.arquivoCSV.readLine()) != null) {
        String[] corredores = linha.split(separadorCSV);
        cadastroCorredores.put(corredores[2], new ArrayList<String>(Arrays.asList(corredores[0],corredores[1])));
      }

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
    return cadastroCorredores;
  }

}
