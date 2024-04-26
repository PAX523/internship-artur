package com.quadient.internship.artur.monster;

public class Monster {


    protected String name;
    protected int alter;
    protected int koerpergroese;
    protected int punktzahl;
    protected int kraft = 5000;

    public void setKraft(int kraftEingabe) {
        kraft = kraftEingabe;
    }

    public void setName(String nameEingabe) {
        name = nameEingabe;
    }

    public void setAlter(int alterEingabe) {
        alter = alterEingabe;
    }

    public void setGroese(int groeseEingabe) {
        koerpergroese = groeseEingabe;
    }

    public void setPunktzahlt(int punktzahlEingabe) {
        punktzahl = punktzahlEingabe;
    }

    public void essen() {

        System.out.println("MHhhh... LECKER!");
        kraft += 100;
    }

    public void kaempfen() {
        System.out.println("Ich werde dich TÖTEN!");
        kraft = kraft - koerpergroese * 3;
        punktzahl = punktzahl + koerpergroese * 3;
    }

    public void gerauscheMachen() {
        System.out.println("ICh muss leiser sein sonst kommt MAMA!");
    }

    public void schlafen() {
        System.out.println("Roah...schhhh...tsssssss...tssss...Isch will noch ned aufstehn...mtalm.!?");
    }

}
