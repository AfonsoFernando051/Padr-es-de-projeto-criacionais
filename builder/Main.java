package builder;
// Cliente
public class Main {
    public static void main(String[] args) {
        // Usando o Builder para construir um objeto Car
        Car car = new CarBuilder()
                    .setBrand("Toyota")
                    .setModel("Corolla")
                    .setYear(2022)
                    .build();

        // Usando o objeto Car construído
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
