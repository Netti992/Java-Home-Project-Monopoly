import javax.swing.*;

public class Work extends Field {
    public Work(int x) {
        super(x);
    }

        public void activityEvent() {
            JOptionPane.showMessageDialog(null, "You got reward!");
            Player.getMoney(10000);
    }
}
