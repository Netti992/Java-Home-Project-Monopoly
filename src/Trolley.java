public class Trolley extends Field {
    public Trolley(int x) {
        super(x);

        if (Player.actualPlace == this.place) {
            System.out.println("You travel with trolley, you can throw once more");
        }
    }
}
