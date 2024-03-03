package padroes.criacionais.factory;

//ConcreteProduct (Produto Concreto)
class DocumentoPDF implements Documento {
	public void abrir() {
	   System.out.println("Abrindo documento PDF");
	}
	
	public void fechar() {
	   System.out.println("Fechando documento PDF");
	}
}