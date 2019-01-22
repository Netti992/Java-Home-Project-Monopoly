import javax.swing.*;

public class Prison extends Field {
    public Prison(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
            JOptionPane.showMessageDialog(null, "Börtönben vagy, fizess 1000-t!");
            player.lostMoney(500);
        }
}
