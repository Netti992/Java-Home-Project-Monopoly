public class You_lettered extends Field {

    public You_lettered(int x) {
        super(x);

    }
        public void youLettered() {
        if (Player.actualPlace == this.place) {
            System.out.println("You littered! Pay 200!");
            Player.lostMoney(200);
        }
    }
}

