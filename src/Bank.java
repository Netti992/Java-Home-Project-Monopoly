import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Bank extends Field {
    JLabel background;

    public Bank(int x) {
        super(x);
    }

    @Override
    public void activityEvent(Player player) {
        JDialog bankFrame = new JDialog();
        bankFrame.setSize(400, 250);
        bankFrame.setLayout(null);
        bankFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        bankFrame.setResizable(true);
        bankFrame.setBackground(Color.white);

        // Frame magyarázata
        JLabel bankText = new JLabel("<html><font color=black><Strong>Itt vehetsz fel hitelt. &nbsp</Strong></font>" +
                "<font color=black>Mennyit szeretnél? &nbsp</font></html>");
        Font myFont = new Font("Perpetua", Font.BOLD, 20);
        bankText.setFont(myFont);
        bankText.setBounds(90, 20, 250, 100);
        bankText.setHorizontalAlignment(JLabel.CENTER);
        bankText.setVerticalAlignment(JLabel.TOP);
        bankText.setVisible(true);
        bankFrame.add(bankText);

        JTextField textField = new JTextField();
        textField.setBounds(40, 80, 200, 40);
        bankFrame.add(textField);


        // felvesz gomb
        JButton saveButton = new JButton("Felvesz");
        saveButton.setBounds(50, 140, 80, 30);
        saveButton.setVisible(true);
        bankFrame.add(saveButton);

        saveButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                String loanStringMoney = textField.getText();
                int newLoan = Integer.parseInt(loanStringMoney);
                player.setLoan(newLoan);
                System.out.println(newLoan);
                System.out.println(player.getLoan());
                player.haveLoan = true;
                bankFrame.dispose();
            }
        });

        // visszaad gomb
        JButton giveBackButton = new JButton("Visszafizet");
        giveBackButton.setBounds(150, 140, 80, 30);
        giveBackButton.setVisible(true);
        bankFrame.add(giveBackButton);

        giveBackButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String loanStringMoney = textField.getText();
                int giveLoan = Integer.parseInt(loanStringMoney);
                int lostMoney = giveLoan;
                player.lostMoney(lostMoney);
                player.giveLoan(giveLoan);
                if (player.loan == 0) {
                player.haveLoan = false;
            }
                bankFrame.dispose();
        }
        });

        bankFrame.setVisible(true);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - bankFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - bankFrame.getHeight()) / 2);
        bankFrame.setLocation(x, y);

        background = new JLabel();
        background.setSize(400, 250);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        bankFrame.add(background);
    }
}