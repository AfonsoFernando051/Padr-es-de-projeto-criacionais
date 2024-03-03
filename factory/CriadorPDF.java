package padroes.criacionais.factory;

public class CriadorPDF extends CriadorDocumento {
	 protected Documento criarDocumento() {
	     return new DocumentoPDF();
	 }
 
 	@Override
	public void processarDocumento() {
		// TODO Auto-generated method stub
		super.processarDocumento();
		System.out.println("Documento PDF processado...");
	}
}