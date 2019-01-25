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
        bankFrame.setSize(450, 250);
        bankFrame.setLayout(null);
        bankFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        bankFrame.setResizable(true);
        bankFrame.setBackground(Color.white);

        // Frame magyarázata
        JLabel bankText = new JLabel("<html><font color=black><Strong>Here you can get loan. </Strong></font>" +
                "<font color=black>How many would you like? &nbsp</font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        bankText.setFont(myFont);
        bankText.setBounds(70, 10, 350, 100);
        bankText.setHorizontalAlignment(JLabel.CENTER);
        bankText.setVerticalAlignment(JLabel.TOP);
        bankText.setVisible(true);
        bankFrame.add(bankText);

        JTextField textField = new JTextField();
        textField.setBounds(110, 80, 200, 40);
        bankFrame.add(textField);


        // felvesz gomb
        JButton saveButton = new JButton("Refinancing");
        saveButton.setBounds(70, 140, 130, 30);
        saveButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
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
        JButton giveBackButton = new JButton("Retaliate");
        giveBackButton.setBounds(210, 140, 130, 30);
        giveBackButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
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
        background.setSize(450, 250);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        bankFrame.add(background);
    }
}