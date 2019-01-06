public class Work extends Field {
    public Work(int x) {
        super(x);

        if (Player.actualPlace == this.place) {
            System.out.println("You got reward!");
            Player.getMoney(10000);
        }
    }
}
