public class Start extends Field {

    public Start(int x) {
        super(x);
    }

public void startActivity() {
        // ha starton áll, 6000-t kap
        if (Player.actualPlace == this.place) {
            Player.getMoney(6000);
        }

        // ha áthalad a starton, 4000-t kap
        if (Player.actualPlace > 30) {
            Player.getMoney(4000);
            Player.actualPlace -= 30;
        }
    }
}
