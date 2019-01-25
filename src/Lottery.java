import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Lottery extends Field{
    JLabel background;

    public Lottery(int x) {
        super(x);
    }

    @Override
    public void activityEvent(Player player) {

        JDialog lotteryFrame = new JDialog();
        lotteryFrame.setSize(400, 200);
        lotteryFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        lotteryFrame.setLayout(null);
        lotteryFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lotteryFrame.setResizable(true);
        lotteryFrame.setBackground(Color.white);

        JLabel lotteryLabel = new JLabel("<html><font color=black>You bought a lottery ticket, you have to pay 50, and pull a lucky card! </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        lotteryLabel.setFont(myFont);
        lotteryLabel.setBounds(50, 20, 300, 120);
        lotteryLabel.setHorizontalAlignment(JLabel.CENTER);
        lotteryLabel.setVerticalAlignment(JLabel.TOP);
        lotteryLabel.setVisible(true);
        lotteryFrame.add(lotteryLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        lotteryFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - lotteryFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - lotteryFrame.getHeight()) / 2);
        lotteryFrame.setLocation(x, y);

        player.haveCard = true;
        player.lostMoney(50);
        cards.randomCard(player);

        lotteryFrame.setVisible(true);

        System.out.println("Lotto: " +cards.cardString);
    }
}
