package padroes.criacionais.factory;

public class CriadorPDF extends CriadorDocumento {
	protected Documento criarDocumento() {
		return new DocumentoPDF();
	}

	@Override
	public void processarDocumento() {
		super.processarDocumento();
	}
}