import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ImportadorCSV {
  private String caminhoArquivo;

  public ImportadorCSV() {
    this.caminhoArquivo = "/home/thiago/Documentos/Aulas-Ufsc/DSO/trabalho-dso/trabalho-dso/corredores.csv";
  }

  public HashMap<String, ArrayList<String>> importarCSV() {
    CSVParser arquivoCSV = new CSVParser();

    return arquivoCSV.parsearConteudoComVirgula(caminhoArquivo);
  }
}
