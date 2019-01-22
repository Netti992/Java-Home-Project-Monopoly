import javax.swing.*;

public class Insurer extends Field {
    public Insurer(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
        JOptionPane.showMessageDialog(null, "Biztosító");
    }
}
