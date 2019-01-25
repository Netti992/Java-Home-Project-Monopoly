import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class RealEstateAgency extends Field {
    JLabel background;

    public RealEstateAgency(int x) {
        super(x);
    }

    @Override
    public void activityEvent(Player player) {

            JDialog realEstateFrame = new JDialog();
            realEstateFrame.setSize(450, 230);
            realEstateFrame.setLayout(null);
            realEstateFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            realEstateFrame.setResizable(true);
            realEstateFrame.setBackground(Color.white);

            // Frame magyarázata
            JLabel realEstateText = new JLabel("<html><font color=black><Strong>You can buy a house. The price is: 60.000. " +
                    "Would you like to buy? &nbsp</Strong></font></html>");
            Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
            realEstateText.setFont(myFont);
            realEstateText.setBounds(60, 20, 350, 100);
            realEstateText.setHorizontalAlignment(JLabel.CENTER);
            realEstateText.setVerticalAlignment(JLabel.TOP);
            realEstateText.setVisible(true);
            realEstateFrame.add(realEstateText);

            // igen
            JButton yesButton = new JButton();
            yesButton.setText("Yes");
            yesButton.setBounds(90, 120, 100, 40);
            yesButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
            realEstateFrame.add(yesButton);
            realEstateFrame.setVisible(true);
            yesButton.setFocusable(false);

            yesButton.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    if (player.haveHouse) {
                        JOptionPane.showMessageDialog(null, "You already have a house!");
                    }
                    if (!player.haveHouse) {
                        player.haveHouse = true;
                        player.lostMoney(60000);
                        realEstateFrame.dispose();
                    }
                }
            });


    // nem
    JButton noButton = new JButton();
            noButton.setText("No");
            noButton.setBounds(220, 120, 100, 40);
            noButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
            realEstateFrame.add(noButton);
            realEstateFrame.setVisible(true);
            noButton.setFocusable(false);

            noButton.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                realEstateFrame.dispose();
        }
    });

        background = new JLabel();
        background.setSize(450, 230);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        realEstateFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - realEstateFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - realEstateFrame.getHeight()) / 2);
        realEstateFrame.setLocation(x, y);
}
}

