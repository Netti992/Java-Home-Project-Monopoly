import javax.swing.*;

public class Prison extends Field {
    public Prison(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
            JOptionPane.showMessageDialog(null, "Börtönben vagy, fizess 500-t, és kimaradsz" +
                    "két körből!");
            player.whoTurn += 2;
            player.lostMoney(500);
        }
}
