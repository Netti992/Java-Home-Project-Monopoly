import Fields.Playing_field;

import javax.swing.*;
import java.awt.*;

public class MonopolyGui extends JFrame {
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

        //JButton dice = new JButton("Throw");
        //dice.setBounds(340, 220, 90, 90);
        //add(dice);
        //dice.addActionListener();

        this.revalidate();
        this.repaint();
    }
}
