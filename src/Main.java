public class Main {


    public static void main(String[] args) {
            Player player = new Player();
            Playing_field playing_field = new Playing_field();

            int dice = Playing_field.throwing();
        System.out.println("Throwing: " + dice);
          player.moving(dice);
        }
        }

