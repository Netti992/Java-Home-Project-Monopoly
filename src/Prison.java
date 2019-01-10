import javax.swing.*;

public class Prison extends Field {
    public Prison(int x) {
        super(x);
    }

    public void activityEvent() {
            JOptionPane.showMessageDialog(null, "Börtönben vagy, fizess 1000-t!");
            Player.lostMoney(500);
        }
}
