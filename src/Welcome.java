import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Welcome {

    public Welcome() {
        JFrame welcomeFrame = new JFrame();
        welcomeFrame.setResizable(true);
        welcomeFrame.setSize(700, 500);
        welcomeFrame.setVisible(true);

        // logo
        JButton text = new JButton("");
        text.setIcon((new ImageIcon("./text.jpg")));
        text.setBounds(100, 10, 500, 80);
        text.setVisible(true);
        text.setOpaque(true);
        welcomeFrame.add(text);

        // üdvözlőkép
        JButton welcomePicture = new JButton();
        welcomePicture.setBounds(40, 100, 600, 200);
        welcomePicture.setVisible(true);
        welcomePicture.setOpaque(true);
        welcomeFrame.add(welcomePicture);

        // felirat
        JLabel addYourName = new JLabel("<html><font color=black>Add meg a neved: </font></html>");
        Font myFont = new Font("Perpetua", Font.BOLD, 18);
        addYourName.setFont(myFont);
        addYourName.setBounds(270, 310, 150, 100);
        addYourName.setHorizontalAlignment(JLabel.CENTER);
        addYourName.setVerticalAlignment(JLabel.TOP);
        addYourName.setVisible(true);
        welcomeFrame.add(addYourName);

        // itt adja meg a játékos a nevét
        JTextField nameField = new JTextField();
        nameField.setBounds(240, 350, 200, 40);
        welcomeFrame.add(nameField);

        // play gomb, megnyomására indul a játék
        JButton play = new JButton();
        play.setText("Play");
        play.setBounds(290, 400, 100, 40);
        play.setVisible(true);
        play.setOpaque(true);
        welcomeFrame.add(play);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - welcomeFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - welcomeFrame.getHeight()) / 2);
        welcomeFrame.setLocation(x, y);

        welcomeFrame.setLayout(null);
        welcomeFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        welcomeFrame.setBackground(Color.white);

        play.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String playerName = nameField.getText();
                Playing_field playing_field = new Playing_field(playerName);
                welcomeFrame.dispose();
            }
    });

}
}
