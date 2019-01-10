import javax.swing.*;

public class Bank extends Field {
    public Bank(int x) {
        super(x);
    }

    public void activityEvent() {
            JOptionPane.showMessageDialog(null, "Itt vehetsz fel hitelt, vagy törlesztheted a " +
                    "meglévő tartozásodat.");
        }
    }
