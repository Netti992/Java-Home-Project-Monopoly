import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class PlayingField extends JFrame {

    JLabel background;
    Field[] playingField;
    JLabel humanPlayerLabel;
    JLabel computerPlayerLabel;

    Player humanPlayer;
    Player computerPlayer;

    JButton humanButton;
    JButton computerButton;
    public String playerName;

    public JButton laptop1;
    public JButton laptop2;
    public JButton vacumCleaner1;
    public JButton vacumCleaner2;
    public JButton washingmachine1;
    public JButton washingmachine2;
    public JButton tv1;
    public JButton tv2;
    public JButton radio1;
    public JButton radio2;
    public JButton cupboard1;
    public JButton cupboard2;
    public JButton bed1;
    public JButton bed2;
    public JButton kitchen1;
    public JButton kitchen2;
    public JButton armChair1;
    public JButton armChair2;
    public JButton couch1;
    public JButton couch2;
    public JButton house1;
    public JButton house2;

    public String cardString;
    public JButton cardsButton;


    public PlayingField(String playerName) {

        this.playerName = playerName;
        setResizable(true);
        setSize(1200, 700);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);

        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        getContentPane().setBackground(Color.white);

        // játékos
        humanPlayer = new Player(this);
        if (Characters.characterNumber == 1) {
            humanPlayer.setIcon(new ImageIcon(("./smalldog.jpg")));
        }
        else if (Characters.characterNumber == 2) {
            humanPlayer.setIcon(new ImageIcon(("./smallbalbasaur.png")));
        }
        else if (Characters.characterNumber == 3) {
            humanPlayer.setIcon(new ImageIcon(("./smallniffler.jpg")));
        }
        else if (Characters.characterNumber == 4) {
            humanPlayer.setIcon(new ImageIcon(("./smalldarth.png")));
        }
        humanPlayer.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        humanPlayer.setBounds(40, 20, 44, 44);
        humanPlayer.setVisible(true);
        humanPlayer.setOpaque(true);
        humanPlayer.whoTurn += 1;
        humanPlayer.nextPlayer();
        System.out.println("Human: " + humanPlayer.meTurn);
        System.out.println("Human: " + humanPlayer.whoTurn);
        getContentPane().add(humanPlayer);

        // automata játékos
        computerPlayer = new Player(this);
        computerPlayer.setIcon(new ImageIcon("./mr.png"));
        computerPlayer.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        computerPlayer.setBounds(40, 50 + 20, 44, 44);
        computerPlayer.setVisible(true);
        computerPlayer.setOpaque(true);
        System.out.println("Computer: " + computerPlayer.meTurn);
        System.out.println("Computer: " + computerPlayer.whoTurn);
        getContentPane().add(computerPlayer);

        // első játékos pontjai és bútorai
        humanButton = new JButton(playerName);
        humanButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        if (humanPlayer.meTurn) {
            humanButton.setBackground(new Color(154,205,50));
        } else {
            humanButton.setBackground(new Color(255, 99, 71));
        }
        humanButton.setBounds(240, 220, 150, 40);
        humanButton.setHorizontalAlignment(JLabel.CENTER);
        humanButton.setVerticalAlignment(JLabel.TOP);
        humanButton.setVisible(true);
        getContentPane().add(humanButton);

        humanPlayerLabel = new JLabel("<html><font color=black> Money: </font>" + humanPlayer.money +
                "<br><font color=black> Loan: </font>" + humanPlayer.loan + "</html>");
        Font myFont = new Font(Font.DIALOG_INPUT, Font.BOLD, 18);
        humanPlayerLabel.setFont(myFont);
        humanPlayerLabel.setBounds(230, 270, 170, 100);
        humanPlayerLabel.setHorizontalAlignment(JLabel.CENTER);
        humanPlayerLabel.setVerticalAlignment(JLabel.TOP);
        humanPlayerLabel.setVisible(true);
        getContentPane().add(humanPlayerLabel);

        // bútorok
        laptop1 = new JButton();
        if (!humanPlayer.haveLaptop) {
            laptop1.setIcon(new ImageIcon("./szurkelaptop.jpg"));
        } else {
            laptop1.setIcon(new ImageIcon("./laptop.jpg"));
        }
        laptop1.setBounds(200, 340, 40, 40);
        laptop1.setVisible(true);
        laptop1.setOpaque(true);
        getContentPane().add(laptop1);

        vacumCleaner1 = new JButton();
        if (!humanPlayer.haveVacumCleaner) {
            vacumCleaner1.setIcon(new ImageIcon("./szurkevacumcleaner.jpg"));
        } else {
            vacumCleaner1.setIcon(new ImageIcon("./vacumcleaner.jpg"));
        }
        vacumCleaner1.setBounds(245, 340, 40, 40);
        vacumCleaner1.setVisible(true);
        vacumCleaner1.setOpaque(true);
        getContentPane().add(vacumCleaner1);

        washingmachine1 = new JButton();
        if (!humanPlayer.haveWashingMachine) {
            washingmachine1.setIcon(new ImageIcon("./szurkewashingmachine.jpg"));
        } else {
            washingmachine1.setIcon(new ImageIcon("./washingmachine.jpg"));
        }
        washingmachine1.setBounds(290, 340, 40, 40);
        washingmachine1.setVisible(true);
        washingmachine1.setOpaque(true);
        getContentPane().add(washingmachine1);

        tv1 = new JButton();
        if (!humanPlayer.haveTv) {
            tv1.setIcon(new ImageIcon("./szurketv.jpg"));
        } else {
            tv1.setIcon(new ImageIcon("./tv.jpg"));
        }
        tv1.setBounds(335, 340, 40, 40);
        tv1.setVisible(true);
        tv1.setOpaque(true);
        getContentPane().add(tv1);

        radio1 = new JButton();
        if (!humanPlayer.haveRadio) {
            radio1.setIcon(new ImageIcon("./szurkeradio.jpg"));
        } else {
            radio1.setIcon(new ImageIcon("./radio.jpg"));
        }
        radio1.setBounds(380, 340, 40, 40);
        radio1.setVisible(true);
        radio1.setOpaque(true);
        getContentPane().add(radio1);

        cupboard1 = new JButton();
        if (!humanPlayer.haveCupBoard) {
            cupboard1.setIcon(new ImageIcon("./szurkecupboard.png"));
        } else {
            cupboard1.setIcon(new ImageIcon("./cupboard.png"));
        }
        cupboard1.setBounds(200, 385, 40, 40);
        cupboard1.setVisible(true);
        cupboard1.setOpaque(true);
        getContentPane().add(cupboard1);

        bed1 = new JButton();
        if (!humanPlayer.haveBed) {
            bed1.setIcon(new ImageIcon("./szurkebed.jpg"));
        } else {
            bed1.setIcon(new ImageIcon("./bed.jpg"));
        }
        bed1.setBounds(245, 385, 40, 40);
        bed1.setVisible(true);
        bed1.setOpaque(true);
        getContentPane().add(bed1);

        kitchen1 = new JButton();
        if (!humanPlayer.haveKitchenFurniture) {
            kitchen1.setIcon(new ImageIcon("./szurkekitchen.png"));
        } else {
            kitchen1.setIcon(new ImageIcon("./kitchen.png"));
        }
        kitchen1.setBounds(290, 385, 40, 40);
        kitchen1.setVisible(true);
        kitchen1.setOpaque(true);
        getContentPane().add(kitchen1);

        armChair1 = new JButton();
        if (!humanPlayer.haveArmChair) {
            armChair1.setIcon(new ImageIcon("./szurkearmchair.jpg"));
        } else {
            armChair1.setIcon(new ImageIcon("./armchair.jpg"));
        }
        armChair1.setBounds(335, 385, 40, 40);
        armChair1.setVisible(true);
        armChair1.setOpaque(true);
        getContentPane().add(armChair1);

        couch1 = new JButton();
        if (!humanPlayer.haveCouch) {
            couch1.setIcon(new ImageIcon("./szurkecouch.jpg"));
        } else {
            couch1.setIcon(new ImageIcon("./couch.jpg"));
        }
        couch1.setBounds(380, 385, 40, 40);
        couch1.setVisible(true);
        couch1.setOpaque(true);
        getContentPane().add(couch1);

        house1 = new JButton();
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
        computerButton = new JButton("Mr. Monopoly");
        computerButton.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 18));
        if (computerPlayer.meTurn) {
            computerButton.setBackground(new Color(154,205,50));
        } else {
            computerButton.setBackground(new Color(255, 99, 71));
        }
        computerButton.setBounds(520, 220, 170, 40);
        computerButton.setHorizontalAlignment(JLabel.CENTER);
        computerButton.setVerticalAlignment(JLabel.TOP);
        computerButton.setVisible(true);
        getContentPane().add(computerButton);

        computerPlayerLabel = new JLabel("<html><font color=black> Money: </font>" + computerPlayer.money +
                "<br><font color=black> Loan: </font>" + computerPlayer.loan + "</html>");
        computerPlayerLabel.setFont(myFont);
        computerPlayerLabel.setBounds(530, 270, 150, 100);
        computerPlayerLabel.setHorizontalAlignment(JLabel.CENTER);
        computerPlayerLabel.setVerticalAlignment(JLabel.TOP);
        computerPlayerLabel.setVisible(true);
        getContentPane().add(computerPlayerLabel);

        // bútorok
        laptop2 = new JButton();
        if (!computerPlayer.haveLaptop) {
            laptop2.setIcon(new ImageIcon("./szurkelaptop.jpg"));
        } else {
            laptop2.setIcon(new ImageIcon("./laptop.jpg"));
        }
        laptop2.setBounds(500, 340, 40, 40);
        laptop2.setVisible(true);
        laptop2.setOpaque(true);
        getContentPane().add(laptop2);

        vacumCleaner2 = new JButton();
        if (!computerPlayer.haveVacumCleaner) {
            vacumCleaner2.setIcon(new ImageIcon("./szurkevacumcleaner.jpg"));
        } else {
            vacumCleaner2.setIcon(new ImageIcon("./vacumcleaner.jpg"));
        }
        vacumCleaner2.setBounds(545, 340, 40, 40);
        vacumCleaner2.setVisible(true);
        vacumCleaner2.setOpaque(true);
        getContentPane().add(vacumCleaner2);

        washingmachine2 = new JButton();
        if (!computerPlayer.haveWashingMachine) {
            washingmachine2.setIcon(new ImageIcon("./szurkewashingmachine.jpg"));
        } else {
            washingmachine2.setIcon(new ImageIcon("./washingmachine.jpg"));
        }
        washingmachine2.setBounds(590, 340, 40, 40);
        washingmachine2.setVisible(true);
        washingmachine2.setOpaque(true);
        getContentPane().add(washingmachine2);

        tv2 = new JButton();
        if (!computerPlayer.haveTv) {
            tv2.setIcon(new ImageIcon("./szurketv.jpg"));
        } else {
            tv2.setIcon(new ImageIcon("./tv.jpg"));
        }
        tv2.setBounds(635, 340, 40, 40);
        tv2.setVisible(true);
        tv2.setOpaque(true);
        getContentPane().add(tv2);

        radio2 = new JButton();
        if (!computerPlayer.haveRadio) {
            radio2.setIcon(new ImageIcon("./szurkeradio.jpg"));
        } else {
            radio2.setIcon(new ImageIcon("./radio.jpg"));
        }
        radio2.setBounds(680, 340, 40, 40);
        radio2.setVisible(true);
        radio2.setOpaque(true);
        getContentPane().add(radio2);

        cupboard2 = new JButton();
        if (!computerPlayer.haveCupBoard) {
            cupboard2.setIcon(new ImageIcon("./szurkecupboard.png"));
        } else {
            cupboard2.setIcon(new ImageIcon("./cupboard.png"));
        }
        cupboard2.setBounds(500, 385, 40, 40);
        cupboard2.setVisible(true);
        cupboard2.setOpaque(true);
        getContentPane().add(cupboard2);

        bed2 = new JButton();
        if (!computerPlayer.haveBed) {
            bed2.setIcon(new ImageIcon("./szurkebed.jpg"));
        } else {
            bed2.setIcon(new ImageIcon("./bed.jpg"));
        }
        bed2.setBounds(545, 385, 40, 40);
        bed2.setVisible(true);
        bed2.setOpaque(true);
        getContentPane().add(bed2);

        kitchen2 = new JButton();
        if (!computerPlayer.haveKitchenFurniture) {
            kitchen2.setIcon(new ImageIcon("./szurkekitchen.png"));
        } else {
            kitchen2.setIcon(new ImageIcon("./kitchen.png"));
        }
        kitchen2.setBounds(590, 385, 40, 40);
        kitchen2.setVisible(true);
        kitchen2.setOpaque(true);
        getContentPane().add(kitchen2);

        armChair2 = new JButton();
        if (!computerPlayer.haveArmChair) {
            armChair2.setIcon(new ImageIcon("./szurkearmchair.jpg"));
        } else {
            armChair2.setIcon(new ImageIcon("./armchair.jpg"));
        }
        armChair2.setBounds(635, 385, 40, 40);
        armChair2.setVisible(true);
        armChair2.setOpaque(true);
        getContentPane().add(armChair2);

        couch2 = new JButton();
        if (!computerPlayer.haveCouch) {
            couch2.setIcon(new ImageIcon("./szurkecouch.jpg"));
        } else {
            couch2.setIcon(new ImageIcon("./couch.jpg"));
        }
        couch2.setBounds(680, 385, 40, 40);
        couch2.setVisible(true);
        couch2.setOpaque(true);
        getContentPane().add(couch2);


        house2 = new JButton();
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
        dice.setIcon(new ImageIcon("./dice.jpg"));
        dice.setBounds(825, 220, 70, 70);
        dice.setBackground(Color.darkGray);
        dice.setVisible(true);
        getContentPane().add(dice);

        // mindig az dob, akinek a meTurn true, a whoTurn-ből elvesz, vagy kivon
        dice.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                refresh(humanPlayer);
                if (humanPlayer.meTurn && !computerPlayer.meTurn) {
                    int dice = throwing();
                    humanPlayer.moving(dice);
                    humanPlayer.whoTurn += 1;
                    computerPlayer.whoTurn -= 1;
                    humanPlayer.nextPlayer();
                    computerPlayer.nextPlayer();
                    humanPlayer.haveCard = false;
                    refresh(humanPlayer);
                    repaint();
                }
                else if (computerPlayer.meTurn && !humanPlayer.meTurn) {
                    int dice = throwing();
                    computerPlayer.moving(dice);
                    computerPlayer.whoTurn += 1;
                    humanPlayer.whoTurn -= 1;
                    humanPlayer.nextPlayer();
                    computerPlayer.nextPlayer();
                    computerPlayer.haveCard = false;
                    refresh(computerPlayer);
                    repaint();
                }
                else if (humanPlayer.meTurn && computerPlayer.meTurn) {
                    humanPlayer.whoTurn += 1;
                    computerPlayer.whoTurn += 1;
                    if (humanPlayer.whoTurn > computerPlayer.whoTurn) {
                        int dice = throwing();
                        computerPlayer.moving(dice);
                        computerPlayer.whoTurn += 1;
                        humanPlayer.whoTurn -= 1;
                        humanPlayer.nextPlayer();
                        computerPlayer.nextPlayer();
                        computerPlayer.haveCard = false;
                        refresh(computerPlayer);
                        repaint();
                    }
                    else if (humanPlayer.whoTurn < computerPlayer.whoTurn) {
                        int dice = throwing();
                        humanPlayer.moving(dice);
                        humanPlayer.whoTurn += 1;
                        computerPlayer.whoTurn -= 1;
                        humanPlayer.nextPlayer();
                        computerPlayer.nextPlayer();
                        humanPlayer.haveCard = false;
                        refresh(humanPlayer);
                        repaint();
                    }
                    else if(humanPlayer.whoTurn == computerPlayer.whoTurn) {
                        humanPlayer.whoTurn -= 1;
                    }
                }
                else if (!humanPlayer.meTurn && !computerPlayer.meTurn) {
                        humanPlayer.whoTurn -= 1;
                        computerPlayer.whoTurn -= 1;
                    if (humanPlayer.whoTurn > computerPlayer.whoTurn) {
                        int dice = throwing();
                        computerPlayer.moving(dice);
                        computerPlayer.whoTurn += 1;
                        humanPlayer.whoTurn -= 1;
                        humanPlayer.nextPlayer();
                        computerPlayer.nextPlayer();
                        computerPlayer.haveCard = false;
                        refresh(computerPlayer);
                        repaint();
                    }
                    else if (humanPlayer.whoTurn < computerPlayer.whoTurn) {
                        int dice = throwing();
                        humanPlayer.moving(dice);
                        humanPlayer.whoTurn += 1;
                        computerPlayer.whoTurn -= 1;
                        humanPlayer.nextPlayer();
                        computerPlayer.nextPlayer();
                        humanPlayer.haveCard = false;
                        refresh(humanPlayer);
                        repaint();
                    }
                    else  if (humanPlayer.whoTurn == computerPlayer.whoTurn) {
                            computerPlayer.whoTurn -= 1;
                    }
                }
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
        cardsButton = new JButton();
        if (humanPlayer.haveCard || computerPlayer.haveCard) {
            cardsButton.setText("Van kártyád!");
        }
        if (!humanPlayer.haveCard || !computerPlayer.haveCard){
            cardsButton.setIcon(new ImageIcon("./card.jpg"));
        }
        cardsButton.setBounds(800, 310, 120, 190);
        cardsButton.setVisible(true);
        cardsButton.setOpaque(true);
        getContentPane().add(cardsButton);

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
             int randomElement = new Random().nextInt(14) + 1;


        if (playingField[i] == null) {

            if (randomElement == 1) {
            Bank bank = new Bank(0);
            bank.setIcon(new ImageIcon("./bank.jpg"));
            playingField[i] = bank;
            }

            else if (randomElement == 2) {
            ElectricShop electric_shop = new ElectricShop(0);
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
            RealEstateAgency real_estate_agency = new RealEstateAgency(0);
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

                i++;
        }
        }

            background = new JLabel();
            background.setSize(1200, 700);
            background.setIcon(new ImageIcon("./background.jpg"));
            background.setVisible(true);
            background.setOpaque(true);
            getContentPane().add(background);

    }

    // frissítések
    public void refresh(Player player) {

        GameOver gameOver = new GameOver(player);

        gameOver.nullMoney(player);
        gameOver.youGetAllTheStuff(player);

        humanPlayerLabel.setText("<html><font color=black> Money: </font>" + humanPlayer.money +
                "<br><font color=black> Loan: </font>" + humanPlayer.loan + "</html>");
        computerPlayerLabel.setText("<html><font color=black> Money: </font>" + computerPlayer.money +
                "<br><font color=black> Loan: </font>" + computerPlayer.loan + "</html>");

        if (!humanPlayer.haveCard){
            cardsButton.setIcon(new ImageIcon("./card.jpg"));
        }
        else cardsButton.setText("String");

        if (!computerPlayer.haveCard){
            cardsButton.setIcon(new ImageIcon("./card.jpg"));
        }
        else cardsButton.setText("String");


        if (humanPlayer.meTurn) {
            humanButton.setBackground(new Color(154,205,50));
        } else {
            humanButton.setBackground(new Color(255, 99, 71));
        }

        if (computerPlayer.meTurn) {
            computerButton.setBackground(new Color(154,205,50));
        } else {
            computerButton.setBackground(new Color(255, 99, 71));
        }

        if (!humanPlayer.haveLaptop) {
            laptop1.setIcon(new ImageIcon("./szurkelaptop.jpg"));
        } else {
            laptop1.setIcon(new ImageIcon("./laptop.jpg"));
        }

        if (!computerPlayer.haveLaptop) {
            laptop2.setIcon(new ImageIcon("./szurkelaptop.jpg"));
        } else {
            laptop2.setIcon(new ImageIcon("./laptop.jpg"));
        }

        if (!humanPlayer.haveVacumCleaner) {
            vacumCleaner1.setIcon(new ImageIcon("./szurkevacumcleaner.jpg"));
        } else {
            vacumCleaner1.setIcon(new ImageIcon("./vacumcleaner.jpg"));
        }

        if (!computerPlayer.haveVacumCleaner) {
            vacumCleaner2.setIcon(new ImageIcon("./szurkevacumcleaner.jpg"));
        } else {
            vacumCleaner2.setIcon(new ImageIcon("./vacumcleaner.jpg"));
        }

        if (!humanPlayer.haveWashingMachine) {
            washingmachine1.setIcon(new ImageIcon("./szurkewashingmachine.jpg"));
        } else {
            washingmachine1.setIcon(new ImageIcon("./washingmachine.jpg"));
        }

        if (!computerPlayer.haveWashingMachine) {
            washingmachine2.setIcon(new ImageIcon("./szurkewashingmachine.jpg"));
        } else {
            washingmachine2.setIcon(new ImageIcon("./washingmachine.jpg"));
        }

        if (!humanPlayer.haveTv) {
            tv1.setIcon(new ImageIcon("./szurketv.jpg"));
        } else {
            tv1.setIcon(new ImageIcon("./tv.jpg"));
        }

        if (!computerPlayer.haveTv) {
            tv2.setIcon(new ImageIcon("./szurketv.jpg"));
        } else {
            tv2.setIcon(new ImageIcon("./tv.jpg"));
        }

        if (!humanPlayer.haveRadio) {
            radio1.setIcon(new ImageIcon("./szurkeradio.jpg"));
        } else {
            radio1.setIcon(new ImageIcon("./radio.jpg"));
        }

        if (!computerPlayer.haveRadio) {
            radio2.setIcon(new ImageIcon("./szurkeradio.jpg"));
        } else {
            radio2.setIcon(new ImageIcon("./radio.jpg"));
        }

        if (!humanPlayer.haveCupBoard) {
            cupboard1.setIcon(new ImageIcon("./szurkecupboard.png"));
        } else {
            cupboard1.setIcon(new ImageIcon("./cupboard.png"));
        }

        if (!computerPlayer.haveCupBoard) {
            cupboard2.setIcon(new ImageIcon("./szurkecupboard.png"));
        } else {
            cupboard2.setIcon(new ImageIcon("./cupboard.png"));
        }

        if (!humanPlayer.haveBed) {
            bed1.setIcon(new ImageIcon("./szurkebed.jpg"));
        } else {
            bed1.setIcon(new ImageIcon("./bed.jpg"));
        }

        if (!computerPlayer.haveBed) {
            bed2.setIcon(new ImageIcon("./szurkebed.jpg"));
        } else {
            bed2.setIcon(new ImageIcon("./bed.jpg"));
        }

        if (!humanPlayer.haveKitchenFurniture) {
            kitchen1.setIcon(new ImageIcon("./szurkekitchen.png"));
        } else {
            kitchen1.setIcon(new ImageIcon("./kitchen.png"));
        }

        if (!computerPlayer.haveKitchenFurniture) {
            kitchen2.setIcon(new ImageIcon("./szurkekitchen.png"));
        } else {
            kitchen2.setIcon(new ImageIcon("./kitchen.png"));
        }

        if (!humanPlayer.haveArmChair) {
            armChair1.setIcon(new ImageIcon("./szurkearmchair.jpg"));
        } else {
            armChair1.setIcon(new ImageIcon("./armchair.jpg"));
        }

        if (!computerPlayer.haveArmChair) {
            armChair2.setIcon(new ImageIcon("./szurkearmchair.jpg"));
        } else {
            armChair2.setIcon(new ImageIcon("./armchair.jpg"));
        }

        if (!humanPlayer.haveCouch) {
            couch1.setIcon(new ImageIcon("./szurkecouch.jpg"));
        } else {
            couch1.setIcon(new ImageIcon("./couch.jpg"));
        }

        if (!computerPlayer.haveCouch) {
            couch2.setIcon(new ImageIcon("./szurkecouch.jpg"));
        } else {
            couch2.setIcon(new ImageIcon("./couch.jpg"));
        }

        if (!humanPlayer.haveHouse) {
            house1.setIcon(new ImageIcon("./szurkehaz.png"));
        } else {
            house1.setIcon(new ImageIcon("./haz.png"));
        }

        if (!computerPlayer.haveHouse) {
            house2.setIcon(new ImageIcon("./szurkehaz.png"));
        } else {
            house2.setIcon(new ImageIcon("./haz.png"));
        }
    }
}

