import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Player extends JLabel {
    static int money = 0;
     ArrayList<Furnitures> furnitures = new ArrayList<Furnitures>();
     static int actualPlace = 0;

    // amennyit dob, annyit megy előre
    public void moving(int dice) {
        actualPlace += dice;
        Start.startActivity();
        this.setBounds(Playing_field.playingField[actualPlace].getX(), Playing_field.playingField[actualPlace].getY(), 40, 40);
        System.out.println("ActualPlace: " + actualPlace);
    }

    // ha a játékos pénzt kap
    public static void getMoney(int newMoney) {
        money += newMoney;
    }

    // ha a játékos pénzt veszít
    public static void lostMoney(int lostMoney) {
        money -= lostMoney;
    }




}

