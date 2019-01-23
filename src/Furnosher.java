import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Furnosher extends Field {
    JLabel background;

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
        couchButton.setFocusable(false);

        couchButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveCouch) {
                    JOptionPane.showMessageDialog(null, "Már van kanapéd!");
                }
                if (player.haveHouse && !player.haveCouch) {
                    player.lostMoney(5000);
                    player.haveCouch = true;
                    furnosherFrame.dispose();
                }
                if (!player.haveHouse) {
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
        armChairButton.setFocusable(false);

        armChairButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveArmChair) {
                    JOptionPane.showMessageDialog(null, "Már van foteled!");
                }
                if (player.haveHouse && !player.haveArmChair) {
                    player.lostMoney(2000);
                    player.haveArmChair = true;
                    furnosherFrame.dispose();
                }
                if (!player.haveHouse) {
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
        kitchenFurnitureButton.setFocusable(false);

        kitchenFurnitureButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveKitchenFurniture) {
                    JOptionPane.showMessageDialog(null, "Már van konyhabútorod!");
                }
                if (player.haveHouse && !player.haveKitchenFurniture) {
                    player.lostMoney(6000);
                    player.haveKitchenFurniture = true;
                    furnosherFrame.dispose();
                }
                if (!player.haveHouse) {
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
        bedButton.setFocusable(false);

        bedButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveBed) {
                    JOptionPane.showMessageDialog(null, "Már van ágyad!");
                }
                if (player.haveHouse && !player.haveBed) {
                    player.lostMoney(4000);
                    player.haveBed = true;
                    furnosherFrame.dispose();
                }
                if (!player.haveHouse) {
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
        cupBoardButton.setFocusable(false);

        cupBoardButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (player.haveCupBoard) {
                    JOptionPane.showMessageDialog(null, "Már van szekrényed!");
                }
                if (player.haveHouse && !player.haveCupBoard) {
                    player.lostMoney(5000);
                    player.haveCupBoard = true;
                    furnosherFrame.dispose();
                }
                if (!player.haveHouse) {
                    JOptionPane.showMessageDialog(null, "Még nincs házad, ezért nem tudsz" +
                            "itt vásárolni");
                }
            }
        });

        background = new JLabel();
        background.setSize(400, 400);
        background.setIcon(new ImageIcon("./background.jpg"));
        background.setVisible(true);
        background.setOpaque(true);
        furnosherFrame.add(background);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - furnosherFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - furnosherFrame.getHeight()) / 2);
        furnosherFrame.setLocation(x, y);
    };
    }