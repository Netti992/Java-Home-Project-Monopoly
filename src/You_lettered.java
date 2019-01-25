import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class You_lettered extends Field {

    public You_lettered(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
        JLabel background;

        JDialog litterFrame = new JDialog();
        litterFrame.setSize(400, 200);
        litterFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        litterFrame.setLayout(null);
        litterFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        litterFrame.setResizable(true);
        litterFrame.setBackground(Color.white);

        JLabel litterLabel = new JLabel("<html><font color=black>You littered, you have to pay 200! </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        litterLabel.setFont(myFont);
        litterLabel.setBounds(50, 40, 300, 100);
        litterLabel.setHorizontalAlignment(JLabel.CENTER);
        litterLabel.setVerticalAlignment(JLabel.TOP);
        litterLabel.setVisible(true);
        litterFrame.add(litterLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        litterFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - litterFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - litterFrame.getHeight()) / 2);
        litterFrame.setLocation(x, y);

        player.lostMoney(200);

        litterFrame.setVisible(true);
    }
}

