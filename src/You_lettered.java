import javax.swing.*;

public class You_lettered extends Field {

    public You_lettered(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
            JOptionPane.showMessageDialog(null, "You littered! Pay 200!");
            player.lostMoney(200);
    }
}

