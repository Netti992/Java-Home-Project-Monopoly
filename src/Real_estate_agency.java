import javax.swing.*;

public class Real_estate_agency extends Field {
    public Real_estate_agency(int x) {
        super(x);
    }

        public void activityEvent() {
                JOptionPane.showMessageDialog(null, "You can buy home!");
                Player.lostMoney(60000);
        }

    }

