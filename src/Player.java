import Fields.Playing_field;

import java.util.ArrayList;

public class Player {
    int money = 0;
     ArrayList<Furnitures> furnitures = new ArrayList<Furnitures>();

     int actualPlace = 0;

    public void moving(int dice) {
        actualPlace += dice;
        System.out.println("ActualPlace: " + actualPlace);
    }
}

