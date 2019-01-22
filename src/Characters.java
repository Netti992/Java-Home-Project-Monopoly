import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Characters {

    static String playerName;
    static int characterNumber;
    JButton character1;
    JButton character2;
    JButton character3;
    JButton character4;
    Playing_field playing_field;

    public Characters() {

    // karakterválasztó
    JFrame characterChooseFrame = new JFrame();
        characterChooseFrame.setBackground(Color.white);
        characterChooseFrame.setResizable(true);
        characterChooseFrame.setSize(700, 500);
        characterChooseFrame.setVisible(true);

        JLabel background = new JLabel();
        background.setSize(700, 500);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        characterChooseFrame.add(background);

    // logo
    JButton text2 = new JButton("");
        text2.setIcon((new ImageIcon("./text.jpg")));
        text2.setBounds(99, 10, 500, 80);
        text2.setVisible(true);
        text2.setOpaque(true);
        background.add(text2);

        // karakterválasztáshoz felirat
        JLabel addYourCharacter = new JLabel("<html><font color=black>Choose your character: </font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 18);
        addYourCharacter.setFont(myFont);
        addYourCharacter.setBounds(210, 110, 300, 100);
        addYourCharacter.setHorizontalAlignment(JLabel.CENTER);
        addYourCharacter.setVerticalAlignment(JLabel.TOP);
        addYourCharacter.setVisible(true);
        background.add(addYourCharacter);

        // karakter1
        character1 = new JButton();
        character1.setIcon(new ImageIcon("./bigdog.jpg"));
        character1.setBounds(130, 160, 100, 100);
        character1.setVisible(true);
        character1.setOpaque(true);
        background.add(character1);

        character1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                characterNumber = 1;
                borderToNull();
                character1.setBorder(BorderFactory.createLineBorder(Color.black, 5));
            }
        });

        // karakter2
        character2 = new JButton();
        character2.setIcon(new ImageIcon("./bigbalbasaur.png"));
        character2.setText("");
        character2.setBounds(240, 160, 100, 100);
        character2.setVisible(true);
        character2.setOpaque(true);
        background.add(character2);

        character2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                characterNumber = 2;
                borderToNull();
                character2.setBorder(BorderFactory.createLineBorder(Color.black, 5));
            }
        });

        // karakter3
        character3 = new JButton();
        character3.setIcon(new ImageIcon("./bigniffler.jpg"));
        character3.setText("");
        character3.setBounds(350, 160, 100, 100);
        character3.setVisible(true);
        character3.setOpaque(true);
        background.add(character3);

        character3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                characterNumber = 3;
                borderToNull();
                character3.setBorder(BorderFactory.createLineBorder(Color.black, 5));
            }
        });

        // karakter4
        character4 = new JButton();
        character4.setIcon(new ImageIcon("./bigdarth.png"));
        character4.setText("");
        character4.setBounds(460, 160, 100, 100);
        character4.setVisible(true);
        character4.setOpaque(true);
        background.add(character4);

        character4.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                characterNumber = 4;
                borderToNull();
                character4.setBorder(BorderFactory.createLineBorder(Color.black, 5));
            }
        });


        // névválasztáshoz felirat
        JLabel addYourName = new JLabel("<html><font color=black>Write your name: </font></html>");
        addYourName.setFont(myFont);
        addYourName.setBounds(250, 300, 200, 100);
        addYourName.setHorizontalAlignment(JLabel.CENTER);
        addYourName.setVerticalAlignment(JLabel.TOP);
        addYourName.setVisible(true);
        background.add(addYourName);

        // itt adja meg a játékos a nevét
        JTextField nameField = new JTextField();
        nameField.setBounds(235, 340, 200, 40);
        background.add(nameField);

        // play gomb, megnyomására indul a játék
        JButton play = new JButton();
        play.setText("Play");
        play.setBounds(285, 400, 100, 40);
        play.setVisible(true);
        play.setOpaque(true);
        background.add(play);

        play.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String playerName = nameField.getText();
                if (nameField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You don't write your name!");
                }
                else if (characterNumber == 0) {
                    JOptionPane.showMessageDialog(null, "You don't choose a character!");
                }
                else if (!nameField.getText().isEmpty() && characterNumber != 0) {
                    playing_field = new Playing_field(playerName);
                    characterChooseFrame.dispose();
                    //Playing_field.humanPlayer.whoTurn += 1;
                }
            }
        });

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - characterChooseFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - characterChooseFrame.getHeight()) / 2);
        characterChooseFrame.setLocation(x, y);

        characterChooseFrame.setLayout(null);
        characterChooseFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        characterChooseFrame.setBackground(Color.white);
}

    //bordernullázás
    public void borderToNull() {
        character1.setBorder(null);
        character2.setBorder(null);
        character3.setBorder(null);
        character4.setBorder(null);
    }

    public Playing_field getPlaying_field() {
        return playing_field;
    }
}
