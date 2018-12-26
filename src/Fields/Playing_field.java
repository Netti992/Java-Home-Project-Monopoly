package Fields;

import javax.swing.*;

public class Playing_field extends JPanel {
    Field[] playElements = new Field[15];

    // dobókocka, ami egy számot ad, ennyit kell majd lépni
    public int throwing() {
        int dice = (int) Math.floor(Math.random() * (5 - 1) + 1);
        return dice;
    }

    // a pálya elemeinek megalkotása
    public void makeTheElements() {

        Bank bank = new Bank();
        playElements[0] = bank;
        Electric_shop electric_shop = new Electric_shop();
        playElements[1] = electric_shop;
        Furnosher furnosher = new Furnosher();
        playElements[2] = furnosher;
        Hospital hospital = new Hospital();
        playElements[3] = hospital;
        Insurer insurer = new Insurer();
        playElements[4] = insurer;
        Lottery lottery = new Lottery();
        playElements[5] = lottery;
        Prison prison = new Prison();
        playElements[6] = prison;
        Real_estate_agency real_estate_agency = new Real_estate_agency();
        playElements[7] = real_estate_agency;
        Sweep sweep = new Sweep();
        playElements[8] = sweep;
        Trolley trolley = new Trolley();
        playElements[9] = trolley;
        Vacation vacation = new Vacation();
        playElements[10] = vacation;
        Work work = new Work();
        playElements[11] = work;
        Wrong_washing_machine wrong_washing_machine = new Wrong_washing_machine();
        playElements[12] = wrong_washing_machine;
        You_lettered you_lettered = new You_lettered();
        playElements[13] = you_lettered;
        Your_tv_burned your_tv_burned = new Your_tv_burned();
        playElements[14] = your_tv_burned;
    }

    // pálya legenerálása: a start mező fix, a többi random
    public void makeThePlayingField() {
        makeTheElements();
        Field[] playingField = new Field[30];

        Start start = new Start();
        playingField[0] = start;

        for(int i = 0; i < playingField.length; i++) {
            int randomElement = (int) (Math.random()* playElements.length);
            if (playingField[i] == null) {
                playingField[i] = playElements[randomElement];
                playingField[i].place = i;
            }
            System.out.println(playingField[i]);
            System.out.println(playingField[i].place);
        }
}


}
