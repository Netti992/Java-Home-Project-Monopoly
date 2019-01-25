import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GameOver{
    JLabel background;

public GameOver(Player player) {
    }

    public boolean nullMoney(Player player) {
        if (player.money < 0) {

            JDialog lostMoneyFrame = new JDialog();
            lostMoneyFrame.setSize(500, 400);
            lostMoneyFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
            lostMoneyFrame.setLayout(null);
            lostMoneyFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            lostMoneyFrame.setResizable(true);
            lostMoneyFrame.setBackground(Color.white);

            JLabel lostMoneyLabel = new JLabel();
            lostMoneyLabel.setText("<html><font color=black>Game is over! You lost all your money! :( </font></html>");
            Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
            lostMoneyLabel.setFont(myFont);
            lostMoneyLabel.setBounds(30, 100, 200, 200);
            lostMoneyLabel.setHorizontalAlignment(JLabel.CENTER);
            lostMoneyLabel.setVerticalAlignment(JLabel.TOP);
            lostMoneyLabel.setVisible(true);
            lostMoneyFrame.add(lostMoneyLabel);

            JButton monopoly = new JButton();
            monopoly.setIcon((new ImageIcon("./mrmonopoly.jpg")));
            monopoly.setBounds(240, 30, 200, 280);
            monopoly.setVisible(true);
            monopoly.setOpaque(true);
            lostMoneyFrame.add(monopoly);

            background = new JLabel();
            background.setSize(500, 400);
            background.setIcon(new ImageIcon("./background.jpg"));
            background.setVisible(true);
            background.setOpaque(true);
            lostMoneyFrame.add(background);

            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - lostMoneyFrame.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - lostMoneyFrame.getHeight()) / 2);
            lostMoneyFrame.setLocation(x, y);

            lostMoneyFrame.setVisible(true);
        }
        return player.youLostAllMoney;
    }

    public boolean youGetAllTheStuff(Player player) {
        if (player.haveCouch && player.haveArmChair && player.haveKitchenFurniture
            && player.haveBed && player.haveCupBoard && player.haveRadio
            && player.haveTv && player.haveWashingMachine && player.haveVacumCleaner
            && player.haveLaptop && player.haveHouse && !player.haveInsurance) {

            JDialog gameOverFrame = new JDialog();
            gameOverFrame.setSize(500, 400);
            gameOverFrame.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
            gameOverFrame.setLayout(null);
            gameOverFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            gameOverFrame.setResizable(true);
            gameOverFrame.setBackground(Color.white);

            JLabel gameOverLabel = new JLabel();
            gameOverLabel.setText("<html><font color=black>You win! Congratulations! :)</font></html>");
            Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
            gameOverLabel.setFont(myFont);
            gameOverLabel.setBounds(30, 100, 200, 200);
            gameOverLabel.setHorizontalAlignment(JLabel.CENTER);
            gameOverLabel.setVerticalAlignment(JLabel.TOP);
            gameOverLabel.setVisible(true);
            gameOverFrame.add(gameOverLabel);

            JButton monopoly = new JButton();
            monopoly.setIcon((new ImageIcon("./mrmonopoly.jpg")));
            monopoly.setBounds(240, 30, 200, 280);
            monopoly.setVisible(true);
            monopoly.setOpaque(true);
            gameOverFrame.add(monopoly);

            background = new JLabel();
            background.setSize(500, 400);
            background.setIcon(new ImageIcon("./background.jpg"));
            background.setVisible(true);
            background.setOpaque(true);
            gameOverFrame.add(background);

            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - gameOverFrame.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - gameOverFrame.getHeight()) / 2);
            gameOverFrame.setLocation(x, y);

            gameOverFrame.setVisible(true);
        }
        return player.youWin;
    }
}
