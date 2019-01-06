public class Real_estate_agency extends Field {
    public Real_estate_agency(int x) {
        super(x);

        if (Player.actualPlace == this.place) {
            System.out.println("You can buy home!");
            Player.lostMoney(60000);
        }
    }
}
