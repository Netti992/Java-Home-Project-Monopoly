import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Bank extends Field {
    public Bank(int x) {
        super(x);
    }

    @Override
    public void activityEvent() {

    }

    public static void bankEvent() {
        JDialog bankFrame = new JDialog();
        bankFrame.setSize(300, 250);
        bankFrame.setLayout(null);
        bankFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        bankFrame.setResizable(true);
        bankFrame.setBackground(Color.white);

        // Frame magyarázata
        JLabel bankText = new JLabel("<html><font color=black><Strong>Itt vehetsz fel hitelt. &nbsp</Strong></font>" +
                "<font color=black>Mennyit szeretnél? &nbsp</font></html>");
        Font myFont = new Font("Perpetua", Font.BOLD, 20);
        bankText.setFont(myFont);
        bankText.setBounds(50, 20, 250, 100);
        bankText.setHorizontalAlignment(JLabel.CENTER);
        bankText.setVerticalAlignment(JLabel.TOP);
        bankText.setVisible(true);
        bankFrame.add(bankText);

        JTextField textField = new JTextField();
        textField.setBounds(40, 80, 200, 40);
        bankFrame.add(textField);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(50, 140, 80, 30);
        saveButton.setVisible(true);
        bankFrame.add(saveButton);

        saveButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Player.getMoney(200);
                Player.haveLoan = true;
            }
        });


        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(140, 140, 80, 30);
        exitButton.setVisible(true);
        bankFrame.add(exitButton);


        bankFrame.setVisible(true);

    }
}