import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Hospital extends Field {
    JLabel background;
    public Hospital(int x) {
        super(x);
    }

    public void activityEvent(Player player) {

        JDialog hospitalFrame = new JDialog();
        hospitalFrame.setSize(400, 200);
        hospitalFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        hospitalFrame.setLayout(null);
        hospitalFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        hospitalFrame.setResizable(true);
        hospitalFrame.setBackground(Color.white);

        JLabel hospitalLabel = new JLabel("<html><font color=black>You are on a hospital, you can't throw in the next round! </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        hospitalLabel.setFont(myFont);
        hospitalLabel.setBounds(50, 30, 300, 100);
        hospitalLabel.setHorizontalAlignment(JLabel.CENTER);
        hospitalLabel.setVerticalAlignment(JLabel.TOP);
        hospitalLabel.setVisible(true);
        hospitalFrame.add(hospitalLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        hospitalFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - hospitalFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - hospitalFrame.getHeight()) / 2);
        hospitalFrame.setLocation(x, y);

        player.whoTurn +=1;

        hospitalFrame.setVisible(true);
    }
}
