import Fields.*;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
            Playing_field playing_field = new Playing_field();
            Player player = new Player();

            int dice = playing_field.throwing();
            playing_field.makeThePlayingField();
            player.moving(dice);
        }
        }

