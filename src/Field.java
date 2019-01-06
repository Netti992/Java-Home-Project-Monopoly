import javax.swing.*;

public abstract class Field extends JLabel{
    int place;
    int width = 90;
    int height = 90;

    public Field(int i) {
        setOpaque(true);
    }

    public void position(int i) {
        if (place >= 0 && place <= 10) {
            this.setBounds(40 + i * (90+ 10), 20, width, height);
            this.setText(place + "");
        }

         if (place > 10 && place < 16) {
             i -= 10;
            this.setBounds(1040, 20 + i * (90 + 10), width, height);
            this.setText(place + "");
        }

        if (place > 15 && place < 26) {
            i -= 15;
           this.setBounds(1050 - ((i * 100) + 10), 520, width, height);
           this.setText(place + "");
        }

        if (place > 25) {
        i -= 25;
          this.setBounds(40, 530 - ((i * 100) + 10), width, height);
          this.setText(place + "");
        }
    }

}
