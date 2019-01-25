import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Insurer extends Field {
    public Insurer(int x) {
        super(x);
    }

    public void activityEvent(Player player) {

        JLabel background;

        JDialog insurerFrame = new JDialog();
        insurerFrame.setSize(450, 230);
        insurerFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        insurerFrame.setLayout(null);
        insurerFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        insurerFrame.setResizable(true);
        insurerFrame.setBackground(Color.white);

        JLabel insurerLabel = new JLabel("<html><font color=black>You can here take out an insurance! Would you like it? </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        insurerLabel.setFont(myFont);
        insurerLabel.setBounds(60, 20, 350, 100);
        insurerLabel.setHorizontalAlignment(JLabel.CENTER);
        insurerLabel.setVerticalAlignment(JLabel.TOP);
        insurerLabel.setVisible(true);
        insurerFrame.add(insurerLabel);

        // igen
        JButton yesButton = new JButton();
        yesButton.setText("Yes");
        yesButton.setBounds(90, 120, 100, 40);
        yesButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        insurerFrame.add(yesButton);
        insurerFrame.setVisible(true);
        yesButton.setFocusable(false);

        yesButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (!player.haveInsurance) {
                    player.haveInsurance = true;
                    insurerFrame.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "You already have insurance!");
            }
        });


        // nem
        JButton noButton = new JButton();
        noButton.setText("No");
        noButton.setBounds(220, 120, 100, 40);
        noButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        insurerFrame.add(noButton);
        insurerFrame.setVisible(true);
        noButton.setFocusable(false);

        noButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                insurerFrame.dispose();
            }
        });


        background = new JLabel();
        background.setSize(450, 230);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        insurerFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - insurerFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - insurerFrame.getHeight()) / 2);
        insurerFrame.setLocation(x, y);

        insurerFrame.setVisible(true);
    }

}
