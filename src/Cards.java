import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cards extends JLabel {

    int cardNumber = (int) Math.floor(Math.random() * (15 - 1) + 1);
    String cardString = "Nincs kártyád";

    public void randomCard(Player player) {
        if (cardNumber == 1) {
            cardString = "Új cipőt kell venned, fizess 50-t!";
            player.lostMoney(50);
        }
        else if (cardNumber == 2) {
            cardString = "Elromlott a porszívód, a javíttatására fizess 100-t!";
            player.lostMoney(100);
        }
        else if (cardNumber == 3) {
            cardString = "Jutalmat kaptál: 200-t!";
            player.getMoney(200);
        }
        else if (cardNumber == 4) {
            cardString = "Nyertél a tombolán 500-t!";
            player.getMoney(500);
        }
        else if (cardNumber == 5) {
            cardString = "Megbetegedtél, gyógyszert kell venned, fizess 100-t!";
            player.lostMoney(100);
        }
        else if (cardNumber == 6) {
            cardString = "Elmentél nyaralni, fizess 800-t!";
            player.lostMoney(800);
        }
        else if (cardNumber == 7) {
            cardString = "Az év dolgozója lettél, jutalmad 1000!";
            player.getMoney(1000);
        }
        else if (cardNumber == 8) {
            cardString = "Bulizni mentél a hétvégén, fizess 200-t!";
            player.lostMoney(200);
        }
        else if (cardNumber == 9) {
            cardString = "Vettél egy új telefont, fizess 700-t!";
            player.lostMoney(700);
        }
        else if (cardNumber == 10) {
            cardString = "Születésnapod van, a családtól kaptál 1000-t!";
            player.getMoney(1000);
        }
        else if (cardNumber == 11) {
            cardString = "Megbüntettek a tömegközlekedésen, mert lejárt a jegyed. Fizess 100-t!";
            player.lostMoney(100);
        }
        else if (cardNumber == 12) {
            cardString = "Moziba mész este, fizess 50-t!";
            player.lostMoney(50);
        }
        else if (cardNumber == 13) {
            cardString = "Gratulálok, nyertél egy konyhabútort! Ha már van, akkor megkapod az árát.";
            if (player.haveKitchenFurniture) {
                player.getMoney(6000);
            }
            else {
                player.haveKitchenFurniture = true;
            }
        }
        else if (cardNumber == 14) {
            cardString = "Gratulálok, nyertél egy tv-t! Ha már van, akkor megkapod az árát.";
            if (player.haveTv) {
                player.getMoney(6000);
            }
            else {
                player.haveTv = true;
            }
        }
        else if (cardNumber == 15) {
            cardString = "Ajándékot kell venned egy barátodnak, ami 50!";
            player.lostMoney(50);
        }
    }
}
