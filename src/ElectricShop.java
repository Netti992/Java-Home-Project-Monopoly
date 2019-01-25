import javafx.scene.control.RadioButton;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class ElectricShop extends Field {
    JLabel background;

    public ElectricShop(int x) {
        super(x);
    }

    @Override
    public void activityEvent(Player player) {

        JDialog electricShopFrame = new JDialog();
        electricShopFrame.setSize(400, 400);

        electricShopFrame.setLayout(null);
        electricShopFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        electricShopFrame.setResizable(true);
        electricShopFrame.setBackground(Color.white);


        // Frame magyarázata
        JLabel electricShopText = new JLabel("<html><font color=black><Strong>Here you can buy electric things. " +
                "What would you want to buy?&nbsp</Strong></font></html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
        electricShopText.setFont(myFont);
        electricShopText.setBounds(30, 5, 350, 100);
        electricShopText.setHorizontalAlignment(JLabel.CENTER);
        electricShopText.setVerticalAlignment(JLabel.TOP);
        electricShopText.setVisible(true);
        electricShopFrame.add(electricShopText);

        // rádió
        JButton radioButton = new JButton();
        radioButton.setText("Radio");
        radioButton.setBounds(90, 95, 200, 40);
        radioButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        electricShopFrame.add(radioButton);
        electricShopFrame.setVisible(true);
        radioButton.setFocusable(false);
        radioButton.setFocusable(false);

        radioButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveRadio) {
                    JOptionPane.showMessageDialog(null, "You already have a radio!");
                }
                if (player.haveHouse && !player.haveRadio) {
                    player.lostMoney(500);
                    player.haveRadio = true;
                    electricShopFrame.dispose();
                }
                if (!player.haveHouse) {
                    JOptionPane.showMessageDialog(null, "You don't have a house, so you can't buy anything here.");
                }
            }
        });

        // tv
        JButton tvButton = new JButton();
        tvButton.setText("TV");
        tvButton.setBounds(90, 145, 200, 40);
        tvButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        electricShopFrame.add(tvButton);
        electricShopFrame.setVisible(true);
        tvButton.setFocusable(false);
        tvButton.setFocusable(false);

        tvButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveTv) {
                    JOptionPane.showMessageDialog(null, "You already have a tv!");
                }
                if (player.haveHouse && !player.haveTv) {
                    player.lostMoney(6000);
                    player.haveTv = true;
                    electricShopFrame.dispose();
                    System.out.println(player.haveTv);
                }
                if (!player.haveHouse) {
                    JOptionPane.showMessageDialog(null, "You don't have a house, so you can't buy anything here.");
                }
            }
        });

        // washingMachine
        JButton washingMachineButton = new JButton();
        washingMachineButton.setText("Washing machine");
        washingMachineButton.setBounds(90, 195, 200, 40);
        washingMachineButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        electricShopFrame.add(washingMachineButton);
        electricShopFrame.setVisible(true);
        washingMachineButton.setFocusable(false);
        washingMachineButton.setFocusable(false);

        washingMachineButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveWashingMachine) {
                    JOptionPane.showMessageDialog(null, "You already have a washing machine!");
                }
                if (player.haveHouse && !player.haveWashingMachine) {
                    player.lostMoney(6000);
                    player.haveWashingMachine = true;
                    electricShopFrame.dispose();
                }
                if (!player.haveHouse) {
                    JOptionPane.showMessageDialog(null, "You don't have a house, so you can't buy anything here.");
                }
            }
        });

        // vacuumCleaner
        JButton vacuumCleanerButton = new JButton();
        vacuumCleanerButton.setText("Vacuum Cleaner");
        vacuumCleanerButton.setBounds(90, 245, 200, 40);
        vacuumCleanerButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        electricShopFrame.add(vacuumCleanerButton);
        electricShopFrame.setVisible(true);
        vacuumCleanerButton.setFocusable(false);
        vacuumCleanerButton.setFocusable(false);

        vacuumCleanerButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveVacumCleaner) {
                    JOptionPane.showMessageDialog(null, "You already have a vacuum cleaner!");
                }
                if (player.haveHouse && !player.haveVacumCleaner) {
                    player.lostMoney(3000);
                    player.haveVacumCleaner = true;
                    electricShopFrame.dispose();
                }
                if (!player.haveHouse) {
                    JOptionPane.showMessageDialog(null, "You don't have a house, so you can't buy anything here.");
                }
            }
        });

        // laptop
        JButton laptopButton = new JButton();
        laptopButton.setText("Laptop");
        laptopButton.setBounds(90, 295, 200, 40);
        laptopButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 14));
        electricShopFrame.add(laptopButton);
        electricShopFrame.setVisible(true);
        laptopButton.setFocusable(false);
        laptopButton.setFocusable(false);

        laptopButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveLaptop) {
                    JOptionPane.showMessageDialog(null, "You already have a laptop!");
                }
                if (player.haveHouse && !player.haveLaptop) {
                    player.lostMoney(10000);
                    player.haveLaptop = true;
                    electricShopFrame.dispose();
                    System.out.println(player.haveLaptop);
                }
                if (!player.haveHouse) {
                    JOptionPane.showMessageDialog(null, "You don't have a house, so you can't buy anything here.");
                }
            }
        });

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        electricShopFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - electricShopFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - electricShopFrame.getHeight()) / 2);
        electricShopFrame.setLocation(x, y);

    }
}
