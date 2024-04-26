package com.quadient.internship.artur.monster;

public class Monster {

    private String name;
    private int alter;
    private int koerpergroese;
    private int punktzahl;
    private int kraft = 5000;

    public void setKraft(int kraftEingabe) {
        kraft = kraftEingabe;
    }

    public void setFellfarbe(String nameEingabe) {
        name = nameEingabe;
    }

    public void setAugenfarbe(int alterEingabe) {
        alter = alterEingabe;
    }

    public void setGroese(int groeseEingabe) {
        koerpergroese = groeseEingabe;
    }

    public void setGewicht(int punktzahlEingabe) {
        punktzahl = punktzahlEingabe;
    }

    public void essen() {

        System.out.println("MHhhh... LECKER!");
    }

    public void kaempfen() {
        System.out.println("Ich werde dich TÖTEN!");
    }

    public void gerauscheMachen() {
        System.out.println("ICh muss leiser sein sonst kommt MAMA!");
    }

    public void schlafen() {
        System.out.println("Roah...schhhh...tsssssss...tssss...Isch will noch ned aufstehn...mtalm.!?");
    }

}
