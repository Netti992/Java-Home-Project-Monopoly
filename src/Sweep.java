import javax.swing.*;

public class Sweep extends Field {
    public Sweep(int x) {
        super(x);
    }

    public void activityEvent() {
        JOptionPane.showMessageDialog(null, "Kéményseprő");
    }
}
