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
    public void activityEvent(Player player) {

    }

    public static void bankEvent(Player player) {
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
        textField.getText();

        String loanStringMoney = textField.getText();
        int loanMoney = Integer.parseInt(loanStringMoney);

        // felvesz gomb
        JButton saveButton = new JButton("Felvesz");
        saveButton.setBounds(50, 140, 80, 30);
        saveButton.setVisible(true);
        bankFrame.add(saveButton);

        saveButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                player.getLoan(loanMoney);
                player.haveLoan = true;
                bankFrame.dispose();
            }
        });

        // visszaad gomb
        JButton giveBackButton = new JButton("Visszafizet");
        giveBackButton.setBounds(150, 140, 80, 30);
        giveBackButton.setVisible(true);
        bankFrame.add(giveBackButton);

        saveButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                player.giveLoan(loanMoney);
                if (player.loan == 0) {
                player.haveLoan = true;
            }
                bankFrame.dispose();
        }
        });


        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(250, 140, 80, 30);
        exitButton.setVisible(true);
        bankFrame.add(exitButton);
        bankFrame.dispose();


        bankFrame.setVisible(true);

    }
}