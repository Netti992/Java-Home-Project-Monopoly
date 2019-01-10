import javax.swing.*;
import java.awt.*;

public class Furnosher extends Field {
    int couch = 5000;
    boolean haveCouch = false;

    int armChair = 2000;
    boolean haveArmChair = false;

    int kitchenFurniture = 6000;
    boolean haveKitchenFurniture = false;

    int bed = 4000;
    boolean haveBed = false;

    int cupBoard = 5000;
    boolean haveCupBoard = false;

    public Furnosher(int x) {
        super(x);
    }


    public void activityEvent() {
            JOptionPane.showMessageDialog(null, "Furnosher");
    }

/*
    public void buying() {
        if () {
            Player.lostMoney(5000);
            haveCouch = true;
        }
        if () {
            Player.lostMoney(2000);
            haveArmChair = true;
        }
        if () {
            Player.lostMoney(6000);
            haveKitchenFurniture = true;
        }
        if () {
            Player.lostMoney(4000);
            haveBed = true;
        }
        if () {
            Player.lostMoney(5000);
            haveCupBoard = true;
        }
    }*/
}
