import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ImportadorCSV {
  private String caminhoArquivo;
  private HashMap<String, ArrayList<String>> corredores;

  public ImportadorCSV(String caminho) {
    this.caminhoArquivo = caminho;
  }

  public HashMap<String, ArrayList<String>> importarCSV() {
    CSVParser arquivoCSV = new CSVParser();

    corredores = arquivoCSV.parsearConteudoComVirgula(caminhoArquivo);
    System.out.println("passou aqui");
    return corredores;
  }
}
