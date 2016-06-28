import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ImportadorCSV {
  private String caminhoArquivo;
  private BufferedReader bufferReader;

  public ImportadorCSV() {
    this.caminhoArquivo = "D:/trabalho-dso/corredores.csv";
    this.bufferReader = null;
  }

  public void parsearConteudoComVirgula() {
    String linha = "";
    String separadorCSV = ",";

    try {
      bufferReader = new BufferedReader(new FileReader(caminhoArquivo));


      while ((linha = bufferReader.readLine()) != null) {
        String[] corredores = linha.split(separadorCSV);
        System.out.println("Nome [nome = " + corredores[0]+ " , idade = " + corredores[1] + "]");
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (bufferReader != null) {
        try {
          bufferReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
