import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Characters {

    static String playerName;

    public Characters() {

    // karakterválasztó
    JFrame characterChooseFrame = new JFrame();
        characterChooseFrame.setResizable(true);
        characterChooseFrame.setSize(700, 500);
        characterChooseFrame.setVisible(true);

    // logo
    JButton text2 = new JButton("");
        text2.setIcon((new ImageIcon("./text.jpg")));
        text2.setBounds(99, 10, 500, 80);
        text2.setVisible(true);
        text2.setOpaque(true);
        characterChooseFrame.add(text2);

        // karakterválasztáshoz felirat
        JLabel addYourCharacter = new JLabel("<html><font color=black>Válaszd ki a karaktered: </font></html>");
        Font myFont = new Font("Perpetua", Font.BOLD, 18);
        addYourCharacter.setFont(myFont);
        addYourCharacter.setBounds(210, 100, 250, 100);
        addYourCharacter.setHorizontalAlignment(JLabel.CENTER);
        addYourCharacter.setVerticalAlignment(JLabel.TOP);
        addYourCharacter.setVisible(true);
        characterChooseFrame.add(addYourCharacter);

        // karakter1
        JButton character1 = new JButton();
        character1.setText("");
        character1.setBounds(130, 160, 100, 100);
        character1.setVisible(true);
        character1.setOpaque(true);
        characterChooseFrame.add(character1);

        // karakter2
        JButton character2 = new JButton();
        character2.setText("");
        character2.setBounds(240, 160, 100, 100);
        character2.setVisible(true);
        character2.setOpaque(true);
        characterChooseFrame.add(character2);

        // karakter3
        JButton character3 = new JButton();
        character3.setText("");
        character3.setBounds(350, 160, 100, 100);
        character3.setVisible(true);
        character3.setOpaque(true);
        characterChooseFrame.add(character3);

        // karakter4
        JButton character4 = new JButton();
        character4.setText("");
        character4.setBounds(460, 160, 100, 100);
        character4.setVisible(true);
        character4.setOpaque(true);
        characterChooseFrame.add(character4);


        // névválasztáshoz felirat
        JLabel addYourName = new JLabel("<html><font color=black>Add meg a neved: </font></html>");
        Font myFont2 = new Font("Perpetua", Font.BOLD, 18);
        addYourName.setFont(myFont);
        addYourName.setBounds(265, 300, 150, 100);
        addYourName.setHorizontalAlignment(JLabel.CENTER);
        addYourName.setVerticalAlignment(JLabel.TOP);
        addYourName.setVisible(true);
        characterChooseFrame.add(addYourName);

        // itt adja meg a játékos a nevét
        JTextField nameField = new JTextField();
        nameField.setBounds(235, 340, 200, 40);
        characterChooseFrame.add(nameField);

        // play gomb, megnyomására indul a játék
        JButton play = new JButton();
        play.setText("Play");
        play.setBounds(285, 400, 100, 40);
        play.setVisible(true);
        play.setOpaque(true);
        characterChooseFrame.add(play);

        play.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Playing_field playing_field = new Playing_field(playerName);
                String playerName = nameField.getText();
                characterChooseFrame.dispose();
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
}
