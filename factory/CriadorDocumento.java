package padroes.criacionais.factory;

public abstract class CriadorDocumento {
    public void processarDocumento() {
        Documento documento = criarDocumento();
        documento.abrir();
        documento.fechar();
    }

    protected abstract Documento criarDocumento();
}
