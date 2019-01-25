import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Your_tv_burned extends Field {
    public Your_tv_burned(int x) {
        super(x);
    }

    public void activityEvent(Player player) {

        JLabel background;

        JDialog burnedTvFrame = new JDialog();
        burnedTvFrame.setSize(400, 200);
        burnedTvFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        burnedTvFrame.setLayout(null);
        burnedTvFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        burnedTvFrame.setResizable(true);
        burnedTvFrame.setBackground(Color.white);

        JLabel burnedTvLabel = new JLabel("<html><font color=black>Your Tv burned! If you had insurance, you can repair it, but if you haven't, you " +
                "lost it!</font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        burnedTvLabel.setFont(myFont);
        burnedTvLabel.setBounds(50, 20, 300, 130);
        burnedTvLabel.setHorizontalAlignment(JLabel.CENTER);
        burnedTvLabel.setVerticalAlignment(JLabel.TOP);
        burnedTvLabel.setVisible(true);
        burnedTvFrame.add(burnedTvLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        burnedTvFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - burnedTvFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - burnedTvFrame.getHeight()) / 2);
        burnedTvFrame.setLocation(x, y);

        if (player.haveTv && !player.haveInsurance) {
            player.haveTv = false;
        }

        burnedTvFrame.setVisible(true);
            }
        }
