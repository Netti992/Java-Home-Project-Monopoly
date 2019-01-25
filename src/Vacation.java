import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Vacation extends Field {
    public Vacation(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
        JLabel background;

        JDialog vacationFrame = new JDialog();
        vacationFrame.setSize(400, 200);
        vacationFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        vacationFrame.setLayout(null);
        vacationFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vacationFrame.setResizable(true);
        vacationFrame.setBackground(Color.white);

        JLabel vacationLabel = new JLabel("<html><font color=black>You are on a vacation, you can't throw in the next two round! </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        vacationLabel.setFont(myFont);
        vacationLabel.setBounds(50, 30, 300, 100);
        vacationLabel.setHorizontalAlignment(JLabel.CENTER);
        vacationLabel.setVerticalAlignment(JLabel.TOP);
        vacationLabel.setVisible(true);
        vacationFrame.add(vacationLabel);

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        vacationFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - vacationFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - vacationFrame.getHeight()) / 2);
        vacationFrame.setLocation(x, y);

        vacationFrame.setVisible(true);

        player.whoTurn += 2;
    }
}
