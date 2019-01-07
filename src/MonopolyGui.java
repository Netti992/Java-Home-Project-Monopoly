import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MonopolyGui extends JFrame {
    JFrame frame = new JFrame();
    Playing_field playing_field;
    public JButton dice;

    public MonopolyGui() {
        playing_field = new Playing_field();
        playing_field.setBounds(0,0,1250,700);
        setResizable(true);
        setSize(1200, 800);

        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        this.add(playing_field);

        // dobókocka gombja, ha megnyomom, dob egyet
        JButton dice = new JButton("Throw");
        //dice.setBounds(240, 220, 90, 90);
        dice.setBounds(0, 0, 90, 90);
        dice.setVisible(true);
        this.playing_field.add(dice);
        getContentPane().add(dice);

        /*dice.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Playing_field.throwing();
            }
        });*/

        // kártyák gombja, ha a megfelelő mezőre lépek, kapok egy kártyát
        JLabel cards = new JLabel("Cards");
        cards.setBounds(400, 220, 90, 120);
        getContentPane().add(cards);

        this.revalidate();
        this.repaint();
    }
}
