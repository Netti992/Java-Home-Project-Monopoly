public class Start extends Field {

    public Start(int x) {
        super(x);
    }

    public  void activityEvent(Player player) {
        // ha starton áll, 6000-t kap
            player.getMoney(6000);
    }

            public static void newRound(Player player) {
        // ha áthalad a starton, 4000-t kap, a kölcsön 5%-t fizeti
        if (player.actualPlace > 29) {
            player.actualPlace -= 30;
            player.getMoney(4000);
            System.out.println("Money: " + player.money);
            player.payLoan();
            player.haveYouHouse();
        }
    }
    }
