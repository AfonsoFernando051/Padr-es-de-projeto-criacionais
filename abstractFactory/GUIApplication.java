package abstractFactory;

public class GUIApplication {
    private GUIFactory guiFactory;

    public GUIApplication(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUI() {
        Button button = guiFactory.createButton();
        TextBox textBox = guiFactory.createTextBox();

        button.paint();
        textBox.display();
    }

    public static void main(String[] args) {
        GUIApplication windowsApp = new GUIApplication(new WindowsFactory());
        windowsApp.createUI();

        GUIApplication linuxApp = new GUIApplication(new LinuxFactory());
        linuxApp.createUI();
    }
}
