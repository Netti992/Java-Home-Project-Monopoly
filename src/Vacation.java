import javax.swing.*;

public class Vacation extends Field {
    public Vacation(int x) {
        super(x);
    }

    public void activityEvent() {
        JOptionPane.showMessageDialog(null, "Nyaralsz");
    }
}
