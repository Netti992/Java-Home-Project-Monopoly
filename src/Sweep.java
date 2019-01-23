import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sweep extends Field {
    String cardString;
    public Sweep(int x) {
        super(x);
    }

    public void activityEvent(Player player) {
        JOptionPane.showMessageDialog(null, "Kéményseprőt láttál, húzhatsz egy kártyát.");
        player.haveCard = true;
        cards.randomCard(player);
        System.out.println(cards.cardString);
    }
}
