package monostate;

public class Main {
    public static void main(String[] args) {
        // Criando dois objetos Monostate
        Monostate object1 = new Monostate();
        Monostate object2 = new Monostate();

        // Definindo o estado dos objetos
        object1.setData(10);
        object2.setData(20);

        // Ambos os objetos compartilham o mesmo estado
        System.out.println("Data in object1: " + object1.getData()); // Output: Data in object1: 20
        System.out.println("Data in object2: " + object2.getData()); // Output: Data in object2: 20
    }
}

