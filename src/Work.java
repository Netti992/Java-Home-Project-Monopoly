import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Work extends Field {
    JLabel background;

    public Work(int x) {
        super(x);
    }

        public void activityEvent(Player player) {

            JDialog workFrame = new JDialog();
            workFrame.setSize(400, 200);
            workFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
            workFrame.setLayout(null);
            workFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            workFrame.setResizable(true);
            workFrame.setBackground(Color.white);

            JLabel workLabel = new JLabel("<html><font color=black>You are the best college in your job. Your reward is 10000! </font></html>");
            Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
            workLabel.setFont(myFont);
            workLabel.setBounds(50, 30, 300, 100);
            workLabel.setHorizontalAlignment(JLabel.CENTER);
            workLabel.setVerticalAlignment(JLabel.TOP);
            workLabel.setVisible(true);
            workFrame.add(workLabel);

            background = new JLabel();
            background.setSize(400, 400);
            background.setIcon(new ImageIcon("./background.jpg"));
            background.setVisible(true);
            background.setOpaque(true);
            workFrame.add(background);

            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - workFrame.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - workFrame.getHeight()) / 2);
            workFrame.setLocation(x, y);

            player.getMoney(10000);

            workFrame.setVisible(true);
    }
}
