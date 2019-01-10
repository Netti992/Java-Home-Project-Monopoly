import javax.swing.*;

public class Insurer extends Field {
    public Insurer(int x) {
        super(x);
    }

    public void activityEvent() {
        JOptionPane.showMessageDialog(null, "Biztosító");
    }
}
