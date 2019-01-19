import javafx.scene.control.RadioButton;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Electric_shop extends Field {

    public Electric_shop(int x) {
        super(x);
    }

    @Override
    public void activityEvent() {

    }

    public static void electric() {
        JDialog electricShopFrame = new JDialog();
        electricShopFrame.setSize(400, 400);
        electricShopFrame.setLayout(null);
        electricShopFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        electricShopFrame.setResizable(true);
        electricShopFrame.setBackground(Color.white);

        // Frame magyarázata
        JLabel electricShopText = new JLabel("<html><font color=black><Strong>Itt vásárolhatsz electronikai termékeket.&nbsp</Strong></font>" +
                "<font color=black>Melyiket szeretnéd? &nbsp</font></html>");
        Font myFont = new Font("Perpetua", Font.BOLD, 20);
        electricShopText.setFont(myFont);
        electricShopText.setBounds(50, 20, 350, 100);
        electricShopText.setHorizontalAlignment(JLabel.CENTER);
        electricShopText.setVerticalAlignment(JLabel.TOP);
        electricShopText.setVisible(true);
        electricShopFrame.add(electricShopText);

        // rádió
        JButton radioButton = new JButton();
        radioButton.setText("Radio");
        radioButton.setBounds(90, 90, 200, 40);
        electricShopFrame.add(radioButton);
        electricShopFrame.setVisible(true);

        radioButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Player.lostMoney(500);
                Player.haveRadio = true;
                electricShopFrame.dispose();
                System.out.println(Player.haveRadio);
            }
        });

        // tv
        JButton tvButton = new JButton();
        tvButton.setText("TV");
        tvButton.setBounds(90, 140, 200, 40);
        electricShopFrame.add(tvButton);
        electricShopFrame.setVisible(true);

        tvButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Player.lostMoney(6000);
                Player.haveTv = true;
                electricShopFrame.dispose();
                System.out.println(Player.haveTv);
            }
        });

        // washingMachine
        JButton washingMachineButton = new JButton();
        washingMachineButton.setText("Washing machine");
        washingMachineButton.setBounds(90, 190, 200, 40);
        electricShopFrame.add(washingMachineButton);
        electricShopFrame.setVisible(true);

        washingMachineButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Player.lostMoney(6000);
                Player.haveWashingMachine = true;
                electricShopFrame.dispose();
                System.out.println(Player.haveWashingMachine);
            }
        });

        // vacuumCleaner
        JButton vacuumCleanerButton = new JButton();
        vacuumCleanerButton.setText("Vacuum Cleaner");
        vacuumCleanerButton.setBounds(90, 240, 200, 40);
        electricShopFrame.add(vacuumCleanerButton);
        electricShopFrame.setVisible(true);

        vacuumCleanerButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Player.lostMoney(3000);
                Player.haveVacumCleaner = true;
                electricShopFrame.dispose();
                System.out.println(Player.haveVacumCleaner);
            }
        });

        // laptop
        JButton laptopButton = new JButton();
        laptopButton.setText("Laptop");
        laptopButton.setBounds(90, 290, 200, 40);
        electricShopFrame.add(laptopButton);
        electricShopFrame.setVisible(true);

        laptopButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Player.lostMoney(10000);
                Player.haveLaptop = true;
                electricShopFrame.dispose();
                System.out.println(Player.haveLaptop);
            }
        });

    }
}
