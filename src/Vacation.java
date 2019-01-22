import javax.swing.*;

public class Vacation extends Field {
    public Vacation(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
        JOptionPane.showMessageDialog(null, "Nyaralsz");
    }
}
