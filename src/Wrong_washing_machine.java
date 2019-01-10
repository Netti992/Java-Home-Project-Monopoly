import javax.swing.*;

public class Wrong_washing_machine extends Field {
    public Wrong_washing_machine(int x) {
        super(x);
    }

    public void activityEvent() {
        JOptionPane.showMessageDialog(null, "Elromlott a mosógéped");
    }
}
