import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Sweep extends Field {
    JLabel background;

    public Sweep(int x) {
        super(x);
    }

    public void activityEvent(Player player) {

        JDialog sweepFrame = new JDialog();
        sweepFrame.setSize(400, 200);
        sweepFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        sweepFrame.setLayout(null);
        sweepFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        sweepFrame.setResizable(true);
        sweepFrame.setBackground(Color.white);

        JLabel sweepLabel = new JLabel("<html><font color=black>You saw a sweep, you can pull a lucky card! </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        sweepLabel.setFont(myFont);
        sweepLabel.setBounds(50, 40, 300, 120);
        sweepLabel.setHorizontalAlignment(JLabel.CENTER);
        sweepLabel.setVerticalAlignment(JLabel.TOP);
        sweepLabel.setVisible(true);
        sweepFrame.add(sweepLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        sweepFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - sweepFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - sweepFrame.getHeight()) / 2);
        sweepFrame.setLocation(x, y);
        cards.randomCard(player);
        player.setHaveCard(true);

        player.cardString = cards.cardString;

        //player.haveCard = true;
        player.lostMoney(50);

        System.out.println("belső: " + player.haveCard);

        sweepFrame.setVisible(true);

        System.out.println("Sweep: " +cards.cardString);
    }
}
