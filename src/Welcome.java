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

        JLabel background = new JLabel();
        background.setSize(700, 500);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        welcomeFrame.add(background);

        // logo
        JButton text = new JButton("");
        text.setIcon((new ImageIcon("./text.jpg")));
        text.setBounds(100, 10, 500, 80);
        text.setVisible(true);
        text.setOpaque(true);
        background.add(text);

        // üdvözlőkép
        JButton welcomePicture = new JButton();
        welcomePicture.setIcon((new ImageIcon("./welcome.jpg")));
        welcomePicture.setBounds(40, 110, 600, 270);
        welcomePicture.setVisible(true);
        welcomePicture.setOpaque(true);
        background.add(welcomePicture);

        // play gomb, megnyomására indul a játék
        JButton next = new JButton();
        next.setText("Next");
        next.setBounds(230, 400, 100, 40);
        next.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 16));
        next.setVisible(true);
        next.setOpaque(true);
        background.add(next);
        next.setFocusable(false);

        next.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                characters = new Characters();
                welcomeFrame.dispose();
            }
        });

        JButton rules = new JButton();
        rules.setText("Rules");
        rules.setBounds(340, 400, 100, 40);
        rules.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 16));
        rules.setVisible(true);
        rules.setOpaque(true);
        rules.setFocusable(false);
        background.add(rules);

        rules.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "There will be the rules!");
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