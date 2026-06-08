public interface Button {
    void paint();
}

public interface Checkbox {
    void paint();
}

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

public class WinButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

public class WinCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style.");
    }
}

public class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
