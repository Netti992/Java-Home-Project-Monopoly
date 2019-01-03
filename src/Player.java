import Fields.Playing_field;

import java.util.ArrayList;

public class Player {
    int money = 0;
     ArrayList<Furnitures> furnitures = new ArrayList<Furnitures>();

     int actualPlace = 0;

     // amennyit dob, annyit megy előre
    public void moving(int dice) {
        actualPlace += dice;
        System.out.println("ActualPlace: " + actualPlace);
    }

    // ha a játékos pénzt kap
    public void getMoney(int newMoney) {
        money += newMoney;
    }

    // ha a játékos pénzt veszít
    public void lostMoney(int lostMoney) {
        money -= lostMoney;
    }
}

