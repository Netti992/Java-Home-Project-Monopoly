import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Welcome {
    Characters characters;

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
        welcomePicture.setBounds(40, 110, 600, 270);
        welcomePicture.setVisible(true);
        welcomePicture.setOpaque(true);
        welcomeFrame.add(welcomePicture);

        // play gomb, megnyomására indul a játék
        JButton next = new JButton();
        next.setText("Next");
        next.setBounds(290, 400, 100, 40);
        next.setVisible(true);
        next.setOpaque(true);
        welcomeFrame.add(next);

        next.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                characters = new Characters();
                welcomeFrame.dispose();
            }
        });

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - welcomeFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - welcomeFrame.getHeight()) / 2);
        welcomeFrame.setLocation(x, y);

        welcomeFrame.setLayout(null);
        welcomeFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        welcomeFrame.setBackground(Color.white);
    }

    public Characters getCharacters() {
        return characters;
    }
}