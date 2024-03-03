package padroes.criacionais.factory;

//ConcreteProduct (Produto Concreto)
class DocumentoWord implements Documento {
	public void abrir() {
	   System.out.println("Abrindo documento Word");
	}
	
	public void fechar() {
	   System.out.println("Fechando documento Word");
	}
}
