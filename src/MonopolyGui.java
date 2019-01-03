import Fields.Playing_field;

import javax.swing.*;
import java.awt.*;

public class MonopolyGui extends JFrame {
    Playing_field playing_field;

    public MonopolyGui() {
        playing_field = new Playing_field();
        playing_field.setBounds(0,0,1250,500);
        setResizable(true);
        setSize(1200, 650);

        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        this.add(playing_field);
        this.revalidate();
        this.repaint();
    }
}
