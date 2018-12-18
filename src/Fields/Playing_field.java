package Fields;

import java.util.Arrays;
import java.util.List;

public class Playing_field {

    public static void throwing() {
        int dice = (int) Math.floor(Math.random() * (4 - 1) + 1);
        System.out.println(dice);
    }

    public static void makeThePlayingField() {
        List<Object> playingField = Arrays.asList();
    }


}
