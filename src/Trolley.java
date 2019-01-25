import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Trolley extends Field {
    JLabel background;

    public Trolley(int x) {
        super(x);
    }

    public void activityEvent(Player player) {

        JDialog trolleyFrame = new JDialog();
        trolleyFrame.setSize(400, 200);
        trolleyFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        trolleyFrame.setLayout(null);
        trolleyFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        trolleyFrame.setResizable(true);
        trolleyFrame.setBackground(Color.white);

        JLabel trolleyLabel = new JLabel("<html><font color=black>You travel with trolley, you can throw once more! </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        trolleyLabel.setFont(myFont);
        trolleyLabel.setBounds(50, 40, 300, 120);
        trolleyLabel.setHorizontalAlignment(JLabel.CENTER);
        trolleyLabel.setVerticalAlignment(JLabel.TOP);
        trolleyLabel.setVisible(true);
        trolleyFrame.add(trolleyLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        trolleyFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - trolleyFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - trolleyFrame.getHeight()) / 2);
        trolleyFrame.setLocation(x, y);

        player.haveCard = true;
        player.lostMoney(50);
        cards.randomCard(player);

        trolleyFrame.setVisible(true);

            player.whoTurn -= 1;
    }
    }

