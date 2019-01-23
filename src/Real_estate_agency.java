import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Real_estate_agency extends Field {
    JLabel background;

    public Real_estate_agency(int x) {
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
            JLabel realEstateText = new JLabel("<html><font color=black><Strong>Ingatlanközvetítő, itt vehetsz lakást, ára: 60.000 Ft. Szeretnél vásárolni? &nbsp</Strong></font></html>");
            Font myFont = new Font("Perpetua", Font.BOLD, 20);
            realEstateText.setFont(myFont);
            realEstateText.setBounds(60, 20, 350, 100);
            realEstateText.setHorizontalAlignment(JLabel.CENTER);
            realEstateText.setVerticalAlignment(JLabel.TOP);
            realEstateText.setVisible(true);
            realEstateFrame.add(realEstateText);

            // igen
            JButton yesButton = new JButton();
            yesButton.setText("Yes");
            yesButton.setBounds(90, 90, 100, 40);
            realEstateFrame.add(yesButton);
            realEstateFrame.setVisible(true);
            yesButton.setFocusable(false);

            yesButton.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    if (player.haveHouse) {
                        JOptionPane.showMessageDialog(null, "Már van házad!");
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
            noButton.setBounds(220, 90, 100, 40);
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

