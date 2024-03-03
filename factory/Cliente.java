package padroes.criacionais.factory;

public class Cliente {
 public static void main(String[] args) {
     CriadorDocumento criadorPDF = new CriadorPDF();
     criadorPDF.processarDocumento();

     CriadorDocumento criadorWord = new CriadorWord();
     criadorWord.processarDocumento();
 }
}
