import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Playing_field extends JFrame {
    static Field[] playingField;
    static JLabel humanPlayerLabel;
    static JLabel computerPlayerLabel;
    static Player humanPlayer;
    static Player computerPlayer;
    static JButton humanButton;
    static JButton computerButton;

    public Playing_field() {
        setResizable(true);
        setSize(1200, 700);

        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        getContentPane().setBackground(Color.white);

        // játékos
        humanPlayer = new Player();
        humanPlayer.setBackground(Color.blue);
        humanPlayer.setBounds(40, 20, 40, 40);
        humanPlayer.setVisible(true);
        humanPlayer.setOpaque(true);
        getContentPane().add(humanPlayer);

        // automata játékos
        computerPlayer = new Player();
        computerPlayer.setBackground(Color.red);
        computerPlayer.setBounds(40, 70, 40, 40);
        computerPlayer.setVisible(true);
        computerPlayer.setOpaque(true);
        getContentPane().add(computerPlayer);

        // első játékos pontjai és bútorai
        humanButton = new JButton("Player");
        if (humanPlayer.meTurn) {
            humanButton.setBackground(new Color(154,205,50));
        } else {
            humanButton.setBackground(new Color(255, 99, 71));
        }
        humanButton.setBounds(240, 220, 150, 50);
        humanButton.setHorizontalAlignment(JLabel.CENTER);
        humanButton.setVerticalAlignment(JLabel.TOP);
        humanButton.setVisible(true);
        getContentPane().add(humanButton);

        humanPlayerLabel = new JLabel("<html><font color=black> Money: </font>" + humanPlayer.money +
                "<br><font color=black> Loan: </font>" + humanPlayer.loan + "</html>");
        Font myFont = new Font("Perpetua", Font.BOLD, 18);
        humanPlayerLabel.setFont(myFont);
        humanPlayerLabel.setBounds(240, 280, 150, 100);
        humanPlayerLabel.setHorizontalAlignment(JLabel.CENTER);
        humanPlayerLabel.setVerticalAlignment(JLabel.TOP);
        humanPlayerLabel.setVisible(true);
        getContentPane().add(humanPlayerLabel);

        // bútorok
        JButton laptop1 = new JButton();
        if (!humanPlayer.haveLaptop) {
            laptop1.setIcon(new ImageIcon("./szurkelaptop.jpg"));
        } else {
            laptop1.setIcon(new ImageIcon("./laptop.jpg"));
        }
        laptop1.setBounds(200, 340, 40, 40);
        laptop1.setVisible(true);
        laptop1.setOpaque(true);
        getContentPane().add(laptop1);

        JButton vacumCleaner1 = new JButton();
        if (!humanPlayer.haveVacumCleaner) {
            vacumCleaner1.setIcon(new ImageIcon("./szurkevacumcleaner.jpg"));
        } else {
            vacumCleaner1.setIcon(new ImageIcon("./vacumcleaner.jpg"));
        }
        vacumCleaner1.setBounds(245, 340, 40, 40);
        vacumCleaner1.setVisible(true);
        vacumCleaner1.setOpaque(true);
        getContentPane().add(vacumCleaner1);

        JButton washingmachine1 = new JButton();
        if (!humanPlayer.haveWashingMachine) {
            washingmachine1.setIcon(new ImageIcon("./szurkewashingmachine.jpg"));
        } else {
            washingmachine1.setIcon(new ImageIcon("./washingmachine.jpg"));
        }
        washingmachine1.setBounds(290, 340, 40, 40);
        washingmachine1.setVisible(true);
        washingmachine1.setOpaque(true);
        getContentPane().add(washingmachine1);

        JButton tv1 = new JButton();
        if (!humanPlayer.haveTv) {
            tv1.setIcon(new ImageIcon("./szurketv.jpg"));
        } else {
            tv1.setIcon(new ImageIcon("./tv.jpg"));
        }
        tv1.setBounds(335, 340, 40, 40);
        tv1.setVisible(true);
        tv1.setOpaque(true);
        getContentPane().add(tv1);

        JButton radio1 = new JButton();
        if (!humanPlayer.haveRadio) {
            radio1.setIcon(new ImageIcon("./szurkeradio.jpg"));
        } else {
            radio1.setIcon(new ImageIcon("./radio.jpg"));
        }
        radio1.setBounds(380, 340, 40, 40);
        radio1.setVisible(true);
        radio1.setOpaque(true);
        getContentPane().add(radio1);

        JButton cupboard1 = new JButton();
        if (!humanPlayer.haveCupBoard) {
            cupboard1.setIcon(new ImageIcon("./szurkecupboard.png"));
        } else {
            cupboard1.setIcon(new ImageIcon("./cupboard.png"));
        }
        cupboard1.setBounds(200, 385, 40, 40);
        cupboard1.setVisible(true);
        cupboard1.setOpaque(true);
        getContentPane().add(cupboard1);

        JButton bed1 = new JButton();
        if (!humanPlayer.haveBed) {
            bed1.setIcon(new ImageIcon("./szurkebed.jpg"));
        } else {
            bed1.setIcon(new ImageIcon("./bed.jpg"));
        }
        bed1.setBounds(245, 385, 40, 40);
        bed1.setVisible(true);
        bed1.setOpaque(true);
        getContentPane().add(bed1);

        JButton kitchen1 = new JButton();
        if (!humanPlayer.haveKitchenFurniture) {
            kitchen1.setIcon(new ImageIcon("./szurkekitchen.png"));
        } else {
            kitchen1.setIcon(new ImageIcon("./kitchen.png"));
        }
        kitchen1.setBounds(290, 385, 40, 40);
        kitchen1.setVisible(true);
        kitchen1.setOpaque(true);
        getContentPane().add(kitchen1);

        JButton armChair1 = new JButton();
        if (!humanPlayer.haveArmChair) {
            armChair1.setIcon(new ImageIcon("./szurkearmchair.jpg"));
        } else {
            armChair1.setIcon(new ImageIcon("./armchair.jpg"));
        }
        armChair1.setBounds(335, 385, 40, 40);
        armChair1.setVisible(true);
        armChair1.setOpaque(true);
        getContentPane().add(armChair1);

        JButton couch1 = new JButton();
        if (!humanPlayer.haveCouch) {
            couch1.setIcon(new ImageIcon("./szurkecouch.jpg"));
        } else {
            couch1.setIcon(new ImageIcon("./couch.jpg"));
        }
        couch1.setBounds(380, 385, 40, 40);
        couch1.setVisible(true);
        couch1.setOpaque(true);
        getContentPane().add(couch1);

        JButton house1 = new JButton();
        if (!humanPlayer.haveHouse) {
            house1.setIcon(new ImageIcon("./szurkehaz.png"));
        } else {
            house1.setIcon(new ImageIcon("./haz.png"));
        }
        house1.setBounds(260, 435, 100, 70);
        house1.setVisible(true);
        house1.setOpaque(true);
        getContentPane().add(house1);

        // második játékos pontjai és bútorai
        computerButton = new JButton("Monopoly");
        if (!computerPlayer.meTurn) {
            computerButton.setBackground(new Color(154,205,50));
        } else {
            computerButton.setBackground(new Color(255, 99, 71));
        }
        computerButton.setBounds(530, 220, 150, 50);
        computerButton.setHorizontalAlignment(JLabel.CENTER);
        computerButton.setVerticalAlignment(JLabel.TOP);
        computerButton.setVisible(true);
        getContentPane().add(computerButton);

        JLabel computerPlayerLabel = new JLabel("<html><font color=black> Money: </font>" + computerPlayer.money +
                "<br><font color=black> Loan: </font>" + computerPlayer.loan + "</html>");
        computerPlayerLabel.setFont(myFont);
        computerPlayerLabel.setBounds(530, 280, 150, 100);
        computerPlayerLabel.setHorizontalAlignment(JLabel.CENTER);
        computerPlayerLabel.setVerticalAlignment(JLabel.TOP);
        computerPlayerLabel.setVisible(true);
        getContentPane().add(computerPlayerLabel);

        // bútorok
        JButton laptop2 = new JButton();
        if (!computerPlayer.haveLaptop) {
            laptop2.setIcon(new ImageIcon("./szurkelaptop.jpg"));
        } else {
            laptop2.setIcon(new ImageIcon("./laptop.jpg"));
        }
        laptop2.setBounds(500, 340, 40, 40);
        laptop2.setVisible(true);
        laptop2.setOpaque(true);
        getContentPane().add(laptop2);

        JButton vacumCleaner2 = new JButton();
        if (!computerPlayer.haveVacumCleaner) {
            vacumCleaner2.setIcon(new ImageIcon("./szurkevacumcleaner.jpg"));
        } else {
            vacumCleaner2.setIcon(new ImageIcon("./vacumcleaner.jpg"));
        }
        vacumCleaner2.setBounds(545, 340, 40, 40);
        vacumCleaner2.setVisible(true);
        vacumCleaner2.setOpaque(true);
        getContentPane().add(vacumCleaner2);

        JButton washingmachine2 = new JButton();
        if (!computerPlayer.haveWashingMachine) {
            washingmachine2.setIcon(new ImageIcon("./szurkewashingmachine.jpg"));
        } else {
            washingmachine2.setIcon(new ImageIcon("./washingmachine.jpg"));
        }
        washingmachine2.setBounds(590, 340, 40, 40);
        washingmachine2.setVisible(true);
        washingmachine2.setOpaque(true);
        getContentPane().add(washingmachine2);

        JButton tv2 = new JButton();
        if (!computerPlayer.haveTv) {
            tv2.setIcon(new ImageIcon("./szurketv.jpg"));
        } else {
            tv2.setIcon(new ImageIcon("./tv.jpg"));
        }
        tv2.setBounds(635, 340, 40, 40);
        tv2.setVisible(true);
        tv2.setOpaque(true);
        getContentPane().add(tv2);

        JButton radio2 = new JButton();
        if (!computerPlayer.haveRadio) {
            radio2.setIcon(new ImageIcon("./szurkeradio.jpg"));
        } else {
            radio2.setIcon(new ImageIcon("./radio.jpg"));
        }
        radio2.setBounds(680, 340, 40, 40);
        radio2.setVisible(true);
        radio2.setOpaque(true);
        getContentPane().add(radio2);

        JButton cupboard2 = new JButton();
        if (!computerPlayer.haveCupBoard) {
            cupboard2.setIcon(new ImageIcon("./szurkecupboard.png"));
        } else {
            cupboard2.setIcon(new ImageIcon("./cupboard.png"));
        }
        cupboard2.setBounds(500, 385, 40, 40);
        cupboard2.setVisible(true);
        cupboard2.setOpaque(true);
        getContentPane().add(cupboard2);

        JButton bed2 = new JButton();
        if (!computerPlayer.haveBed) {
            bed2.setIcon(new ImageIcon("./szurkebed.jpg"));
        } else {
            bed2.setIcon(new ImageIcon("./bed.jpg"));
        }
        bed2.setBounds(545, 385, 40, 40);
        bed2.setVisible(true);
        bed2.setOpaque(true);
        getContentPane().add(bed2);

        JButton kitchen2 = new JButton();
        if (!computerPlayer.haveKitchenFurniture) {
            kitchen2.setIcon(new ImageIcon("./szurkekitchen.png"));
        } else {
            kitchen2.setIcon(new ImageIcon("./kitchen.png"));
        }
        kitchen2.setBounds(590, 385, 40, 40);
        kitchen2.setVisible(true);
        kitchen2.setOpaque(true);
        getContentPane().add(kitchen2);

        JButton armChair2 = new JButton();
        if (!computerPlayer.haveArmChair) {
            armChair2.setIcon(new ImageIcon("./szurkearmchair.jpg"));
        } else {
            armChair2.setIcon(new ImageIcon("./armchair.jpg"));
        }
        armChair2.setBounds(635, 385, 40, 40);
        armChair2.setVisible(true);
        armChair2.setOpaque(true);
        getContentPane().add(armChair2);

        JButton couch2 = new JButton();
        if (!computerPlayer.haveCouch) {
            couch2.setIcon(new ImageIcon("./szurkecouch.jpg"));
        } else {
            couch2.setIcon(new ImageIcon("./couch.jpg"));
        }
        couch2.setBounds(680, 385, 40, 40);
        couch2.setVisible(true);
        couch2.setOpaque(true);
        getContentPane().add(couch2);


        JButton house2 = new JButton();
        if (!computerPlayer.haveHouse) {
            house2.setIcon(new ImageIcon("./szurkehaz.png"));
        } else {
            house2.setIcon(new ImageIcon("./haz.png"));
        }
        house2.setBounds(560, 435, 100, 70);
        house2.setVisible(true);
        house2.setOpaque(true);
        getContentPane().add(house2);

        // dobókocka gombja, ha megnyomom, dob egyet
        JButton dice = new JButton("");
        dice.setIcon(new ImageIcon("./dice.png"));
        dice.setBounds(830, 215, 80, 80);
        dice.setBackground(Color.darkGray);
        dice.setVisible(true);
        getContentPane().add(dice);

        // mindig az dob, akinek a meTurn true, a whoTurn-ből elvesz, vagy kivon
        dice.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              //  if (humanPlayer.meTurn) {
                    int dice = Playing_field.throwing();
                    humanPlayer.moving(dice, humanPlayer);
              //      humanPlayer.whoTurn += 1;
              //      computerPlayer.whoTurn -= 1;
              //      humanPlayer.nextPlayer(humanPlayer);
                    refresh(humanPlayer);
                    repaint();
              //  }
                /*if (computerPlayer.meTurn) {
                    int dice = Playing_field.throwing();
                    computerPlayer.moving(dice, computerPlayer);
                    computerPlayer.whoTurn += 1;
                    humanPlayer.whoTurn -= 1;
                    computerPlayer.nextPlayer(computerPlayer);
                    refresh(computerPlayer);
                    repaint();
                }*/
            }
        });

        // felirat
        JButton text = new JButton("");
        text.setIcon((new ImageIcon("./text.jpg")));
        text.setBounds(335, 120, 500, 80);
        text.setVisible(true);
        text.setOpaque(true);
        getContentPane().add(text);

        // kártyák gombja, ha a megfelelő mezőre lépek, kiírja a kártya szövegét
        JButton cards = new JButton("");
        cards.setIcon(new ImageIcon("./card.jpg"));
        cards.setBounds(800, 310, 130, 200);
        cards.setVisible(true);
        cards.setOpaque(true);
        getContentPane().add(cards);

        makeThePlayingField();
        repaint();
        setVisible(true);
    }


    // dobókocka, ami egy számot ad, ennyit kell majd lépni
    public static int throwing() {
        int dice = (int) Math.floor(Math.random() * (6 - 1) + 1);
        System.out.println(dice);
        return dice;
    }


    // pálya legenerálása: a start mező fix, a többi random
    public void makeThePlayingField() {
        playingField = new Field[30];

        int i = 1;

        Start start = new Start(0);
        playingField[0] = start;
        start.setIcon(new ImageIcon("./start.jpg"));
        this.getContentPane().add(playingField[0]);
        playingField[0].position(0);

        while(i < 30) {
             int randomElement = (int) (Math.random()* (15 - 1) + 1);

        if (playingField[i] == null) {

            if (randomElement == 1) {
            Bank bank = new Bank(0);
            bank.setIcon(new ImageIcon("./bank.jpg"));
            playingField[i] = bank;
            }

            else if (randomElement == 2) {
            Electric_shop electric_shop = new Electric_shop(0);
            electric_shop.setIcon(new ImageIcon("./electric.jpg"));
            playingField[i] = electric_shop;
            }

            else if (randomElement == 3) {
            Furnosher furnosher = new Furnosher(0);
            furnosher.setIcon(new ImageIcon("./furnitures.jpg"));
            playingField[i] = furnosher;
            }

            else if (randomElement == 4) {
            Hospital hospital = new Hospital(0);
            hospital.setIcon(new ImageIcon("./hospital.jpg"));
            playingField[i] = hospital;
            }

            else if (randomElement == 5) {
            Insurer insurer = new Insurer(0);
            insurer.setIcon(new ImageIcon("./insurer.png"));
            playingField[i] = insurer;
            }

            else if (randomElement == 6) {
            Lottery lottery = new Lottery(0);
            lottery.setIcon(new ImageIcon("./lottery.jpg"));
            playingField[i] = lottery;
            }

            else if (randomElement == 7) {
            Prison prison = new Prison(0);
            prison.setIcon(new ImageIcon("./prison.jpg"));
            playingField[i] = prison;
            }

            else if (randomElement == 8) {
            Real_estate_agency real_estate_agency = new Real_estate_agency(0);
            real_estate_agency.setIcon(new ImageIcon("./agency.jpg"));
            playingField[i] = real_estate_agency;
            }

            else if (randomElement == 9) {
            Sweep sweep = new Sweep(0);
            sweep.setIcon(new ImageIcon("./sweep.jpg"));
            playingField[i] = sweep;
            }

            else if (randomElement == 10) {
            Trolley trolley = new Trolley(0);
            trolley.setIcon(new ImageIcon("./trolley.jpg"));
            playingField[i] = trolley;
            }

            else if (randomElement == 11) {
            Vacation vacation = new Vacation(0);
            vacation.setIcon(new ImageIcon("./vacation.jpg"));
            playingField[i] = vacation;
            }

            else if (randomElement == 12) {
            Work work = new Work(0);
            work.setIcon(new ImageIcon("./work.jpg"));
            playingField[i] = work;
            }

            else if (randomElement == 13) {
            Wrong_washing_machine wrong_washing_machine = new Wrong_washing_machine(0);
            wrong_washing_machine.setIcon(new ImageIcon("./washing.jpg"));
            playingField[i] = wrong_washing_machine;
            }

            else if (randomElement == 14) {
            You_lettered you_lettered = new You_lettered(0);
            you_lettered.setIcon(new ImageIcon("./litter.jpg"));
            playingField[i] = you_lettered;
            }

            else if (randomElement == 15) {
            Your_tv_burned your_tv_burned = new Your_tv_burned(0);
            your_tv_burned.setIcon(new ImageIcon("./burning.png"));
            playingField[i] = your_tv_burned;
            }

                playingField[i].place= i;
                playingField[i].position(i);

                this.getContentPane().add(playingField[i]);

                System.out.println(playingField[i]);
                System.out.println(playingField[i].place);

                i++;
          }
        }
    }

    public  static void refresh(Player player) {
        humanPlayerLabel.setText("<html><font color=black> Money: </font>" + Player.money +
                "<br><font color=black> Loan: </font>" + Player.loan + "</html>");
        computerPlayerLabel.setText("<font color=black> Money: </font>" + Player.money +
                "<br><font color=black> Loan: </font>" + Player.loan + "</html>");
    }
}

