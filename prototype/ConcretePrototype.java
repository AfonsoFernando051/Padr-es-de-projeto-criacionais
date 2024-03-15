package prototype;

class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    // Método de clonagem que retorna uma cópia do próprio objeto
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
