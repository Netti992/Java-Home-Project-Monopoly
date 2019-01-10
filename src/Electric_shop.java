import javax.swing.*;

public class Electric_shop extends Field {

    int radio = 500;
    boolean haveRadio = false;

    int tv = 6000;
    boolean haveTv = false;

    int washingMachine = 6000;
    boolean haveWashingMachine = false;

    int vacumCleaner = 3000;
    boolean haveVacumCleaner = false;

    int laptop = 10000;
    boolean haveLaptop = false;

    public Electric_shop(int x) {
        super(x);
    }


    public void activityEvent() {
            JOptionPane.showMessageDialog(null, "Elektronikai cikkek boltja, itt " +
                    "vásárolhatsz műszaki cikkeket.");
    }

    /*
    public void buyThings() {
        if () {
            Player.lostMoney(500);
            haveRadio = true;
        }
        if () {
            Player.lostMoney(6000);
            haveTv = true;
        }
        if () {
            Player.lostMoney(6000);
            haveWashingMachine = true;
        }
        if () {
            Player.lostMoney(3000);
            haveVacumCleaner = true;
        }
        if () {
            Player.lostMoney(10000);
            haveLaptop = true;
        }
    }*/
}
