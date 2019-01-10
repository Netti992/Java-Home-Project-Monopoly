import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Playing_field extends JFrame {
    static Field[] playingField;

    public Playing_field() {
        setResizable(true);
        setSize(1200, 700);

        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        getContentPane().setBackground(Color.white);

        // játékos
        Player player = new Player();
        player.setBackground(Color.blue);
        player.setBounds(40, 20, 40, 40);
        player.setVisible(true);
        player.setOpaque(true);
        getContentPane().add(player);

        // első játékos pontjai és bútorai
        JLabel firstPlayer = new JLabel("<html><font color=black><Strong> First player &nbsp</Strong></font>" +
                "<font color=black> First player's money: &nbsp</font>" + Player.money + "</html>");
        Font myFont = new Font("Perpetua", Font.BOLD, 20);
        firstPlayer.setFont(myFont);
        firstPlayer.setBounds(250, 240, 150, 100);
        firstPlayer.setHorizontalAlignment(JLabel.LEFT);
        firstPlayer.setVerticalAlignment(JLabel.TOP);
        firstPlayer.setVisible(true);
        getContentPane().add(firstPlayer);

        // bútorok
        JButton furniture1 = new JButton();
        furniture1.setBounds(200, 340, 40, 40);
        furniture1.setVisible(true);
        furniture1.setOpaque(true);
        getContentPane().add(furniture1);

        JButton furniture2 = new JButton();
        furniture2.setBounds(245, 340, 40, 40);
        furniture2.setVisible(true);
        furniture2.setOpaque(true);
        getContentPane().add(furniture2);

        JButton furniture3 = new JButton();
        furniture3.setBounds(290, 340, 40, 40);
        furniture3.setVisible(true);
        furniture3.setOpaque(true);
        getContentPane().add(furniture3);

        JButton furniture4 = new JButton();
        furniture4.setBounds(335, 340, 40, 40);
        furniture4.setVisible(true);
        furniture4.setOpaque(true);
        getContentPane().add(furniture4);

        JButton furniture5 = new JButton();
        furniture5.setBounds(380, 340, 40, 40);
        furniture5.setVisible(true);
        furniture5.setOpaque(true);
        getContentPane().add(furniture5);

        JButton furniture6 = new JButton();
        furniture6.setBounds(200, 385, 40, 40);
        furniture6.setVisible(true);
        furniture6.setOpaque(true);
        getContentPane().add(furniture6);

        JButton furniture7 = new JButton();
        furniture7.setBounds(245, 385, 40, 40);
        furniture7.setVisible(true);
        furniture7.setOpaque(true);
        getContentPane().add(furniture7);

        JButton furniture8 = new JButton();
        furniture8.setBounds(290, 385, 40, 40);
        furniture8.setVisible(true);
        furniture8.setOpaque(true);
        getContentPane().add(furniture8);

        JButton furniture9 = new JButton();
        furniture9.setBounds(335, 385, 40, 40);
        furniture9.setVisible(true);
        furniture9.setOpaque(true);
        getContentPane().add(furniture9);

        JButton furniture10 = new JButton();
        furniture10.setBounds(380, 385, 40, 40);
        furniture10.setVisible(true);
        furniture10.setOpaque(true);
        getContentPane().add(furniture10);

        JButton house1 = new JButton();
        house1.setBounds(260, 435, 100, 70);
        house1.setVisible(true);
        house1.setOpaque(true);
        getContentPane().add(house1);

        // második játékos pontjai és bútorai
        JLabel secondPlayer = new JLabel("<html><font color=black><Strong> Second player &nbsp</Strong></font>" +
                "<font color=black> Second player's money: &nbsp</font>" + Player.money + "</html>");
        secondPlayer.setFont(myFont);
        secondPlayer.setBounds(530, 240, 150, 100);
        secondPlayer.setHorizontalAlignment(JLabel.LEFT);
        secondPlayer.setVerticalAlignment(JLabel.TOP);
        secondPlayer.setVisible(true);
        getContentPane().add(secondPlayer);

        JButton furniture11 = new JButton();
        furniture11.setBounds(500, 340, 40, 40);
        furniture11.setVisible(true);
        furniture11.setOpaque(true);
        getContentPane().add(furniture11);

        JButton furniture12 = new JButton();
        furniture12.setBounds(545, 340, 40, 40);
        furniture12.setVisible(true);
        furniture12.setOpaque(true);
        getContentPane().add(furniture12);

        JButton furniture13 = new JButton();
        furniture13.setBounds(590, 340, 40, 40);
        furniture13.setVisible(true);
        furniture13.setOpaque(true);
        getContentPane().add(furniture13);

        JButton furniture14 = new JButton();
        furniture14.setBounds(635, 340, 40, 40);
        furniture14.setVisible(true);
        furniture14.setOpaque(true);
        getContentPane().add(furniture14);

        JButton furniture15 = new JButton();
        furniture15.setBounds(680, 340, 40, 40);
        furniture15.setVisible(true);
        furniture15.setOpaque(true);
        getContentPane().add(furniture15);

        JButton furniture16 = new JButton();
        furniture16.setBounds(500, 385, 40, 40);
        furniture16.setVisible(true);
        furniture16.setOpaque(true);
        getContentPane().add(furniture16);

        JButton furniture17 = new JButton();
        furniture17.setBounds(545, 385, 40, 40);
        furniture17.setVisible(true);
        furniture17.setOpaque(true);
        getContentPane().add(furniture17);

        JButton furniture18 = new JButton();
        furniture18.setBounds(590, 385, 40, 40);
        furniture18.setVisible(true);
        furniture18.setOpaque(true);
        getContentPane().add(furniture18);

        JButton furniture19 = new JButton();
        furniture19.setBounds(635, 385, 40, 40);
        furniture19.setVisible(true);
        furniture19.setOpaque(true);
        getContentPane().add(furniture19);

        JButton furniture110 = new JButton();
        furniture110.setBounds(680, 385, 40, 40);
        furniture110.setVisible(true);
        furniture110.setOpaque(true);
        getContentPane().add(furniture110);

        JButton house11 = new JButton();
        house11.setBounds(560, 435, 100, 70);
        house11.setVisible(true);
        house11.setOpaque(true);
        getContentPane().add(house11);

        // dobókocka gombja, ha megnyomom, dob egyet
        JButton dice = new JButton("");
        dice.setIcon(new ImageIcon("./dice.png"));
        dice.setBounds(830, 215, 80, 80);
        dice.setBackground(Color.darkGray);
        dice.setVisible(true);
        getContentPane().add(dice);

        dice.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int dice = Playing_field.throwing();
                player.moving(dice);
                firstPlayer.setText("<html><font color=black><Strong> First player &nbsp</Strong></font>" +
                        "<font color=black> First player's money: &nbsp</font>" + Player.money + "</html>");
                secondPlayer.setText("<html><font color=black><Strong> Second player &nbsp</Strong></font>" +
                        "<font color=black> Second player's money: &nbsp</font>" + Player.money + "</html>");
                repaint();
            }
        });

        // felirat
        JButton text = new JButton("");
        text.setIcon((new ImageIcon("./text.jpg")));
        text.setBounds(280, 120, 600, 80);
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
        this.getContentPane().add(playingField[0]);
        playingField[0].position(0);

        while(i < 30) {
             int randomElement = (int) (Math.random()* (15 - 1) + 1);

        if (playingField[i] == null) {

            if (randomElement == 1) {
            Bank bank = new Bank(0);
            playingField[i] = bank;
            }

            else if (randomElement == 2) {
            Electric_shop electric_shop = new Electric_shop(0);
            playingField[i] = electric_shop;
            }

            else if (randomElement == 3) {
            Furnosher furnosher = new Furnosher(0);
            playingField[i] = furnosher;
            }

            else if (randomElement == 4) {
            Hospital hospital = new Hospital(0);
            playingField[i] = hospital;
            }

            else if (randomElement == 5) {
            Insurer insurer = new Insurer(0);
            playingField[i] = insurer;
            }

            else if (randomElement == 6) {
            Lottery lottery = new Lottery(0);
            playingField[i] = lottery;
            }

            else if (randomElement == 7) {
            Prison prison = new Prison(0);
            playingField[i] = prison;
            }

            else if (randomElement == 8) {
            Real_estate_agency real_estate_agency = new Real_estate_agency(0);
            playingField[i] = real_estate_agency;
            }

            else if (randomElement == 9) {
            Sweep sweep = new Sweep(0);
            playingField[i] = sweep;
            }

            else if (randomElement == 10) {
            Trolley trolley = new Trolley(0);
            playingField[i] = trolley;
            }

            else if (randomElement == 11) {
            Vacation vacation = new Vacation(0);
            playingField[i] = vacation;
            }

            else if (randomElement == 12) {
            Work work = new Work(0);
            playingField[i] = work;
            }

            else if (randomElement == 13) {
            Wrong_washing_machine wrong_washing_machine = new Wrong_washing_machine(0);
            playingField[i] = wrong_washing_machine;
            }

            else if (randomElement == 14) {
            You_lettered you_lettered = new You_lettered(0);
            playingField[i] = you_lettered;
            }

            else if (randomElement == 15) {
            Your_tv_burned your_tv_burned = new Your_tv_burned(0);
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
}
