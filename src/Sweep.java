import javax.swing.*;

public class Sweep extends Field {
    public Sweep(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
        JOptionPane.showMessageDialog(null, "Kéményseprő");
    }
}
