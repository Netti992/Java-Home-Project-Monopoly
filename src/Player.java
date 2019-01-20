import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Player extends JLabel {
    static boolean haveHouse = false;

    static int money = 0;
    static int loan = 0;
    static int actualPlace = 0;
    static int whoTurn = 0;
    static boolean meTurn;

    static boolean haveCouch = false;
    static boolean haveArmChair = false;
    static boolean haveKitchenFurniture = false;
    static boolean haveBed = false;
    static boolean haveCupBoard = false;
    static boolean haveRadio = false;
    static boolean haveTv = false;
    static boolean haveWashingMachine = false;
    static boolean haveVacumCleaner = false;
    static boolean haveLaptop = false;

    static boolean haveLoan = false;

    public Player() {

    }


    // amennyit dob, annyit megy előre
    public void moving(int dice, Player player) {
        actualPlace += 1;

        Start.newRound();
        haveYouHouse();
        this.setBounds(Playing_field.playingField[actualPlace].getX(), Playing_field.playingField[actualPlace].getY(), 40, 40);

            //Playing_field.playingField[actualPlace].activityEvent();

        //Bank.bankEvent();
        Electric_shop.electric(this);
        //Furnosher.furnosher();
        //Real_estate_agency.realEstateEvent();
        System.out.println("ActualPlace: " + actualPlace);
    }

    // ha a játékos pénzt kap
    public static void getMoney(int newMoney) {
        money += newMoney;
    }

    // ha a játékos pénzt veszít
    public static void lostMoney(int lostMoney) {
        money -= lostMoney;
    }

    // ha a játékos kölcsönt vesz fel, a loan -hoz adja
    public static void getLoan(int newLoan) {
        loan += newLoan;
    }

    // ha a játékos kölcsönt fizet vissza, a loan -ból veszi el
    public static void giveLoan(int giveLoan) {
        loan -= giveLoan;
    }

    // ha a játékosnak kölcsöne van, minden körben visszafizetheti az egészet, vagy kötelezően az 5%-t
    public static void payLoan() {
        if (Player.loan > 20) {
            loan *= 0.95;
        } else {
            loan = 0;
            Player.haveLoan = false;
        }
    }

    // egyszer egyik, azután a másik játékos lép
    public static void nextPlayer(Player player) {
        if (player.whoTurn == 0) {
            player.meTurn = true;
        }
        else player.meTurn = false;
    }


    // ha nincs lakása, minden körben fizet 500-t
    public static void haveYouHouse() {
        if (!Player.haveHouse) {
            lostMoney(500);
        }
    }

}





