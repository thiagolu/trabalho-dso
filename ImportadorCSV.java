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

  public void importarCSV() {
    CSVParser arquivoCSV = new CSVParser();
    arquivoCSV.parsearConteudoComVirgula(caminhoArquivo);
  }
}
