import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Furnosher extends Field {

    public Furnosher(int x) {
        super(x);
    }


    public void activityEvent(Player player) {
        JDialog furnosherFrame = new JDialog();
        furnosherFrame.setSize(400, 400);
        furnosherFrame.setLayout(null);
        furnosherFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        furnosherFrame.setResizable(true);
        furnosherFrame.setBackground(Color.white);

        // Frame magyarázata
        JLabel furnosherText = new JLabel("<html><font color=black><Strong>Itt vásárolhatsz bútorokat.&nbsp</Strong></font>" +
                "<font color=black>Melyiket szeretnéd? &nbsp</font></html>");
        Font myFont = new Font("Perpetua", Font.BOLD, 20);
        furnosherText.setFont(myFont);
        furnosherText.setBounds(50, 20, 350, 100);
        furnosherText.setHorizontalAlignment(JLabel.CENTER);
        furnosherText.setVerticalAlignment(JLabel.TOP);
        furnosherText.setVisible(true);
        furnosherFrame.add(furnosherText);

        // couch
        JButton couchButton = new JButton();
        couchButton.setText("Couch");
        couchButton.setBounds(90, 90, 200, 40);
        furnosherFrame.add(couchButton);
        furnosherFrame.setVisible(true);

        couchButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveHouse) {
                    player.lostMoney(5000);
                    player.haveCouch = true;
                    furnosherFrame.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Még nincs házad, ezért nem tudsz" +
                            "itt vásárolni");
                }
            }
        });

        // armChair
        JButton armChairButton = new JButton();
        armChairButton.setText("Armchair");
        armChairButton.setBounds(90, 140, 200, 40);
        furnosherFrame.add(armChairButton);
        furnosherFrame.setVisible(true);

        armChairButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveHouse) {
                    player.lostMoney(2000);
                    player.haveArmChair = true;
                    furnosherFrame.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Még nincs házad, ezért nem tudsz" +
                            "itt vásárolni");
                }
            }
        });

        // kitchenFurniture
        JButton kitchenFurnitureButton = new JButton();
        kitchenFurnitureButton.setText("Kitchen furniture");
        kitchenFurnitureButton.setBounds(90, 190, 200, 40);
        furnosherFrame.add(kitchenFurnitureButton);
        furnosherFrame.setVisible(true);

        kitchenFurnitureButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveHouse) {
                    player.lostMoney(6000);
                    player.haveKitchenFurniture = true;
                    furnosherFrame.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Még nincs házad, ezért nem tudsz" +
                            "itt vásárolni");
                }
            }
        });

        // bed
        JButton bedButton = new JButton();
        bedButton.setText("Bed");
        bedButton.setBounds(90, 240, 200, 40);
        furnosherFrame.add(bedButton);
        furnosherFrame.setVisible(true);

        bedButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveHouse) {
                    player.lostMoney(4000);
                    player.haveBed = true;
                    furnosherFrame.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Még nincs házad, ezért nem tudsz" +
                            "itt vásárolni");
                }
            }
        });

        // cupBoard
        JButton cupBoardButton = new JButton();
        cupBoardButton.setText("Cupboard");
        cupBoardButton.setBounds(90, 290, 200, 40);
        furnosherFrame.add(cupBoardButton);
        furnosherFrame.setVisible(true);

        cupBoardButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveHouse) {
                    player.lostMoney(5000);
                    player.haveCupBoard = true;
                    furnosherFrame.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Még nincs házad, ezért nem tudsz" +
                            "itt vásárolni");
                }
            }
        });
    };
    }