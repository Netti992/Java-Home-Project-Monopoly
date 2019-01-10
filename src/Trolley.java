import javax.swing.*;

public class Trolley extends Field {
    public Trolley(int x) {
        super(x);
    }

    public void activityEvent() {
            JOptionPane.showMessageDialog(null, "You travel with trolley, you can throw once more");
    }
    }

