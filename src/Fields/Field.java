package Fields;

import javax.swing.*;
import java.awt.*;

public abstract class Field extends JLabel {
    int place;
    int width = 80;
    int height = 60;

    public Field(int x) {
        setOpaque(true);
    }

    public void position(int x) {
        this.setBounds(x * 80 + 20, 60, width, height);
        this.setText(place + "");
    }
}
