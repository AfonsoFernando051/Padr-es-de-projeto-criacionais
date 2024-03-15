package singleton;

public class Main {
    public static void main(String[] args) {
        // Obter a instância única da classe Singleton
        Singleton singletonInstance = Singleton.getInstance();

        // Usar métodos da instância Singleton
        singletonInstance.showMessage();
    }
}
