package singleton;

public class Singleton {
    // Variável estática privada para armazenar a única instância da classe
    private static Singleton instance;

    // Construtor privado para evitar instanciação direta da classe
    private Singleton() {
        // Inicialização de recursos, se necessário
    }

    // Método estático público para retornar a única instância da classe
    public static Singleton getInstance() {
        // Verifica se a instância ainda não foi criada
        if (instance == null) {
            // Se ainda não foi criada, cria uma nova instância
            instance = new Singleton();
        }
        // Retorna a instância única
        return instance;
    }

    // Métodos da classe Singleton
    public void showMessage() {
        System.out.println("Hello, Singleton!");
    }
}
