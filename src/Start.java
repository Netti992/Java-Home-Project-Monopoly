public class Start extends Field {

    public Start(int x) {
        super(x);
    }

public void startActivity() {
        if (Player.actualPlace == this.place) {
            Player.getMoney(6000);
        }

        if (Player.actualPlace > 30) {
            Player.getMoney(4000);
            Player.actualPlace -= 30;
        }
    }

}
