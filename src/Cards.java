import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cards {


    String cardString;

    public void randomCard(Player player) {
        int cardNumber = (int) Math.floor(Math.random() * (15 - 1) + 1);

        if (cardNumber == 1) {
            cardString = "You have to buy shoes, pay 50!";
            player.lostMoney(50);
        }
        else if (cardNumber == 2) {
            cardString = "Your vacuum cleaner went wrong, to repair pay 100!";
            player.lostMoney(100);
        }
        else if (cardNumber == 3) {
            cardString = "You got reward: 200!";
            player.getMoney(200);
        }
        else if (cardNumber == 4) {
            cardString = "You win in the raffle: 500!";
            player.getMoney(500);
        }
        else if (cardNumber == 5) {
            cardString = "You are sick, you have to buy a medicine, pay 100!";
            player.lostMoney(100);
        }
        else if (cardNumber == 6) {
            cardString = "You are on a vacation, pay 800!";
            player.lostMoney(800);
        }
        else if (cardNumber == 7) {
            cardString = "You are the best college in your job, your reward is 1000!";
            player.getMoney(1000);
        }
        else if (cardNumber == 8) {
            cardString = "You were in a party at the weekend, pay 200!";
            player.lostMoney(200);
        }
        else if (cardNumber == 9) {
            cardString = "You bought a new phone, pay 700!";
            player.lostMoney(700);
        }
        else if (cardNumber == 10) {
            cardString = "You have birthday, you got 1000!";
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
