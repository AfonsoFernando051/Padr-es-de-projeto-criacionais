package prototype;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto protótipo
        ConcretePrototype prototype = new ConcretePrototype("Prototype");

        // Clonando o objeto protótipo para criar um novo objeto
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        // Alterando o nome do objeto clonado
        clone.setName("Cloned Prototype");

        // Verificando se os objetos são diferentes
        System.out.println("Original: " + prototype.getName());
        System.out.println("Clone: " + clone.getName());
    }
}
