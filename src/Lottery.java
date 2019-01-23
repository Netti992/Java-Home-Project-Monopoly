import javax.swing.*;

public class Lottery extends Field{

    public Lottery(int x) {
        super(x);
    }

    public void activityEvent(Player player) {

            JOptionPane.showMessageDialog(null, "Lottóztál, fizess 1000-t!");
            player.haveCard = true;
            player.lostMoney(50);
            cards.randomCard(player);
        System.out.println("lotoo" +cards.cardString);
    }
}
