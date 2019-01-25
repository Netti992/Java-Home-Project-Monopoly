import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Prison extends Field {
    JLabel background;

    public Prison(int x) {
        super(x);
    }

    public void activityEvent(Player player) {

        JDialog prisonFrame = new JDialog();
        prisonFrame.setSize(400, 200);
        prisonFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        prisonFrame.setLayout(null);
        prisonFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        prisonFrame.setResizable(true);
        prisonFrame.setBackground(Color.white);

        JLabel prisonLabel = new JLabel("<html><font color=black>You are on a prison, you can't throw in the next two round, and pay 500! </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        prisonLabel.setFont(myFont);
        prisonLabel.setBounds(50, 30, 300, 100);
        prisonLabel.setHorizontalAlignment(JLabel.CENTER);
        prisonLabel.setVerticalAlignment(JLabel.TOP);
        prisonLabel.setVisible(true);
        prisonFrame.add(prisonLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        prisonFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - prisonFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - prisonFrame.getHeight()) / 2);
        prisonFrame.setLocation(x, y);

        prisonFrame.setVisible(true);

            player.whoTurn += 2;
            player.lostMoney(500);
        }
}
