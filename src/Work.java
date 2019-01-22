import javax.swing.*;

public class Work extends Field {
    public Work(int x) {
        super(x);
    }

        public void activityEvent(Player player) {
            JOptionPane.showMessageDialog(null, "You got reward!");
            player.getMoney(10000);
    }
}
