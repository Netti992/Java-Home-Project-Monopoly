import javax.swing.*;

public class Hospital extends Field {
    public Hospital(int x) {
        super(x);
    }

    public void activityEvent() {
            JOptionPane.showMessageDialog(null, "Hospital");
    }
}
