package abstractFactory;

// Concrete Product for Linux
class LinuxTextBox implements TextBox {
    @Override
    public void display() {
        System.out.println("Linux text box");
    }
}