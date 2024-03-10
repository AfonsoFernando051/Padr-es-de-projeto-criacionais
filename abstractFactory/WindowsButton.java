package abstractFactory;

// Concrete Product for Windows
class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button");
    }
}