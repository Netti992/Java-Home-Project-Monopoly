import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Wrong_washing_machine extends Field {
    JLabel background;

    public Wrong_washing_machine(int x) {
        super(x);
    }

    public void activityEvent(Player player) {

        JDialog washFrame = new JDialog();
        washFrame.setSize(400, 200);
        washFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        washFrame.setLayout(null);
        washFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        washFrame.setResizable(true);
        washFrame.setBackground(Color.white);

        JLabel washLabel = new JLabel("<html><font color=black>Your washing machine gone wrong. If you had insurance, you can repair it, but if you haven't, you lost it! </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        washLabel.setFont(myFont);
        washLabel.setBounds(50, 10, 300, 150);
        washLabel.setHorizontalAlignment(JLabel.CENTER);
        washLabel.setVerticalAlignment(JLabel.TOP);
        washLabel.setVisible(true);
        washFrame.add(washLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        washFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - washFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - washFrame.getHeight()) / 2);
        washFrame.setLocation(x, y);

        if (player.haveWashingMachine && !player.haveInsurance) {
            player.haveWashingMachine = false;
        }

        washFrame.setVisible(true);
    }
}
