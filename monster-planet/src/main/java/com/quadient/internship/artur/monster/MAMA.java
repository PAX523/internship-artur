package com.quadient.internship.artur.monster;

public class MAMA extends Monster {
    @Override
    public void gerauscheMachen() {
        System.out.println("Schimpf,Schimpf!!! Koch,Koch!!!");
    }

    public MAMA() {
        name = "Mudder";
        alter = 4500;
        koerpergroese = 160;

    }
}
