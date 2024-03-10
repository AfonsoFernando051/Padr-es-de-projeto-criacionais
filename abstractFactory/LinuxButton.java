package abstractFactory;

// Concrete Product for Linux
class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux button");
    }
}