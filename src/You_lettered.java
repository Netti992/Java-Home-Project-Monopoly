public class You_lettered extends Field {

    public You_lettered(int x) {
        super(x);

        if (Player.actualPlace == this.place) {
            System.out.println("You lettered! Pay 200!");
            Player.lostMoney(200);
        }
    }
}
