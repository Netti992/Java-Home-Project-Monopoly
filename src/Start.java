public class Start extends Field {

    public Start(int x) {
        super(x);
    }

    public  void activityEvent() {
        // ha starton áll, 6000-t kap
            Player.getMoney(6000);
    }

            public static void newRound() {
        // ha áthalad a starton, 4000-t kap, a kölcsön 5%-t fizeti
        if (Player.actualPlace > 29) {
            Player.actualPlace -= 30;
            Player.getMoney(4000);
            System.out.println("Money: " + Player.money);
            Player.payLoan();
            Player.haveYouHouse();
        }
    }
    }
