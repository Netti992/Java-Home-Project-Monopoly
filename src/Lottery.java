import javax.swing.*;

public class Lottery extends Field {
    public Lottery(int x) {
        super(x);
    }

    public void activityEvent() {
            JOptionPane.showMessageDialog(null, "Lottóztál, fizess 1000-t!");
            Player.lostMoney(50);
    }
}
