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
        player.setBackground(Color.black);
        player.setBounds(40, 20, 40, 40);
        player.setVisible(true);
        player.setOpaque(true);
        getContentPane().add(player);

        // dobókocka gombja, ha megnyomom, dob egyet
        JButton dice = new JButton("");
        dice.setIcon(new ImageIcon("./dice.png"));
        dice.setBounds(540, 120, 80, 80);
        dice.setBackground(Color.darkGray);
        dice.setVisible(true);
        getContentPane().add(dice);

        dice.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int dice = Playing_field.throwing();
                player.moving(dice);
                repaint();
            }
        });

        // felirat
        JButton text = new JButton("");
        text.setIcon((new ImageIcon("./text.jpg")));
        text.setBounds(500, 210, 160, 80);
        text.setVisible(true);
        text.setOpaque(true);
        getContentPane().add(text);

        // kártyák gombja, ha a megfelelő mezőre lépek, kiírja a kártya szövegét
        JButton cards = new JButton("");
        cards.setIcon(new ImageIcon("./card.jpg"));
        cards.setBounds(510, 300, 140, 210);
        cards.setVisible(true);
        cards.setOpaque(true);
        getContentPane().add(cards);

        // első játékos pontjai és bútorai
        JLabel firstPlayer = new JLabel("First player");
        Font myFont = new Font("Perpetua", Font.BOLD, 20);
        firstPlayer.setFont(myFont);
        firstPlayer.setBounds(220, 130, 150, 500);
        firstPlayer.setHorizontalAlignment(JLabel.LEFT);
        firstPlayer.setVerticalAlignment(JLabel.TOP);
        firstPlayer.setVisible(true);
        getContentPane().add(firstPlayer);

        // második játékos pontjai és bútorai
        JLabel secondPlayer = new JLabel("Second player");
        secondPlayer.setFont(myFont);
        secondPlayer.setBounds(720, 130, 150, 500);
        secondPlayer.setHorizontalAlignment(JLabel.LEFT);
        secondPlayer.setVerticalAlignment(JLabel.TOP);
        secondPlayer.setVisible(true);
        getContentPane().add(secondPlayer);

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