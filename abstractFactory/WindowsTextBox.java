package abstractFactory;

// Concrete Product for Windows
class WindowsTextBox implements TextBox {
    @Override
    public void display() {
        System.out.println("Windows text box");
    }
}