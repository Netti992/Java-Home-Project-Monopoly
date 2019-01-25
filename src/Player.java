import javax.swing.*;

public class Player extends JLabel {

    boolean youWin = false;
    boolean youLostAllMoney = false;

    boolean haveInsurance = false;
    boolean haveHouse = true;

    boolean haveCard = false;
    int money = 2000;
    int loan = 0;
    int actualPlace = 0;
    int whoTurn = 0;
    boolean meTurn = true;

    boolean haveCouch = true;
    boolean haveArmChair = true;
    boolean haveKitchenFurniture = true;
    boolean haveBed = true;
    boolean haveCupBoard = true;
    boolean haveRadio = true;
    boolean haveTv = true;
    boolean haveWashingMachine = true;
    boolean haveVacumCleaner = true;
    boolean haveLaptop = true;

    PlayingField playing_field;

    boolean haveLoan = false;

    public Player(PlayingField playing_field) {
        this.playing_field = playing_field;
    }

    public int getActualPlace(int actualPlace) {
        return this.actualPlace = actualPlace;
    }

    // amennyit dob, annyit megy előre
    public void moving(int dice) {
        actualPlace += dice;

        Start.newRound(this);
        this.setBounds(playing_field.playingField[actualPlace].getX(), playing_field.playingField[actualPlace].getY(), 44, 44);

           playing_field.playingField[actualPlace].activityEvent(this);
    }

    // ha a játékos pénzt kap
    public void getMoney(int newMoney) {
        money += newMoney;
    }

    // ha a játékos pénzt veszít
    public void lostMoney(int lostMoney) {
        money -= lostMoney;
    }

    // ha a játékos kölcsönt vesz fel, a loan -hoz adja
    public void setLoan(int newLoan) {
        loan += newLoan;
    }

    // ha a játékos kölcsönt fizet vissza, a loan -ból veszi el
    public void giveLoan(int giveLoan) {
        loan -= giveLoan;
    }

    // ha a játékosnak kölcsöne van, minden körben visszafizetheti az egészet, vagy kötelezően az 5%-t
    public void payLoan() {
        int loanFromMoney;
        if (getLoan() > 20) {
            loan *= 0.95;
            loanFromMoney = (int)(loan * 0.95);
            money -= loanFromMoney;
        } else {
            loan = 0;
            money -= getLoan();
            setHaveLoan(false);
        }
    }

    // egyszer egyik, azután a másik játékos lép
    public void nextPlayer() {
        if (whoTurn <= 0) {
            meTurn = true;
        }
        else meTurn = false;
    }


    // ha nincs lakása, minden körben fizet 500-t
    public void haveYouHouse() {
        if (!getHaveHouse(true)) {
            lostMoney(500);
        }
    }

    // ha van biztosítása, minden körben fizet 100-t
    public void haveYouInsurance() {
        if (getHaveInsurance(true)) {
            lostMoney(100);
        }
    }

    public int getLoan() {
        return loan;
    }

    public boolean getHaveLoan() {
        return haveLoan;
    }

    public void setHaveLoan(boolean haveLoan) {
        this.haveLoan = haveLoan;
    }

    public boolean getHaveHouse(boolean haveHouse) {
        return haveHouse;
    }

    public boolean getHaveInsurance(boolean haveInsurance) {
        return haveInsurance;
    }
}





