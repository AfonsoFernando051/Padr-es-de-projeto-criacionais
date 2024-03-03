package padroes.criacionais.factory;

public class CriadorWord extends CriadorDocumento {
	 protected Documento criarDocumento() {
	     return new DocumentoWord();
	 }
 
	@Override
	public void processarDocumento() {
		// TODO Auto-generated method stub
		super.processarDocumento();
		System.out.println("Documento PDF processado...");
	}
	
}
