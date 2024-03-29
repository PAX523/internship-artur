package com.quadient.internship.artur;

import com.quadient.internship.artur.utils.InputUtils;

public class Main {
    private static String name;
    private static int lebenspunkte;
    private static int magiePunkte;

    public static void main(String[] args) {
        System.out.println("Wie lautet euer Name? ");
        lebenspunkte = 100;
        magiePunkte = 200;
        name = InputUtils.readInput();
        if (name.equalsIgnoreCase("Artur")) {
            spezialName();
        } else {
            normalerName();
        }
    }

    private static void magie(int magieLeben) {
        magiePunkte = magiePunkte + magieLeben;
        if (magieLeben > 0) {
            System.out.println("Du hast " + magieLeben + " Magiepunkte dazu gewonnen! Du hast jetzt " + magiePunkte + " Magiepunkte!");
        } else if (magieLeben < 0) {
            System.out.println("Du hast " + (-magieLeben) + " Magiepunkte verloren! Du hast jetzt " + magiePunkte + " Magiepunkte!");
        } else {
            System.out.println("Du hast KEINE Magiepunkte verloren! Du hast immer noch " + magiePunkte + " Magiepunkte!");
        }

        if (magiePunkte <= 0) {
            System.out.println("DU hast keine Magie mehr!Du verlierst nun bei jedem erlittenen Schaden 2mal so viel!" + name);
        }
    }

    private static void leben(int lebensenergie) {
        lebenspunkte = lebenspunkte + lebensenergie;
        if (lebensenergie > 0) {
            System.out.println("Du hast " + lebensenergie + " Lebenspunkte dazu gewonnen! Du hast jetzt " + lebenspunkte + " Lebenspunkte!");
        } else if (lebensenergie < 0) {
            System.out.println("Du hast " + (-lebensenergie) + " Lebenspunkte verloren! Du hast jetzt " + lebenspunkte + " Lebenspunkte!");
        } else {
            System.out.println("Du hast KEINE Lebenspunkte verloren! Du hast immer noch " + lebenspunkte + " Lebenspunkte!");
        }

        if (lebenspunkte <= 0) {
            System.out.println("DU hast kein Leben mehr!DU BIST TOT " + name);
            System.exit(0);
        }
    }

    private static void spezialName() {
        System.out.println("Willkommen König Artur!");
        dunklerWald();
    }

    private static void normalerName() {
        System.out.println("Willkommen " + name + "!");
        dunklerWald();
    }

    private static void dunklerWald() {
        System.out.println("""
                Du bist in einem dunklen Wald.
                Willst du nach links(L) oder
                rechts(R) gehen?
                """);
        String richtung = InputUtils.readInput();
        while (!richtung.equalsIgnoreCase("L") && !richtung.equalsIgnoreCase("R")) {
            richtungKeineAhnung();
            richtung = InputUtils.readInput();
        }
        if (richtung.equalsIgnoreCase("L")) {
            richtungL();
        } else {
            richtungR();
        }


    }

    private static void richtungL() {
        System.out.println("""
                DU gehst nach Links und
                 fällst hin da du über eine
                 Wurzel gefallen bist.
                """);
    }

    private static void richtungR() {
        System.out.println("""
                Du triffst auf einen bösen Troll!
                DER DICH FRESSEN WILL!
                                
                Drück W um weiter zu machen!
                """);
        String weiter = InputUtils.readInput();
        while (!weiter.equalsIgnoreCase("W")) {
            weiterMachen();
            weiter = InputUtils.readInput();
        }
        leben(-10);
        if (magiePunkte <= 0) {
            magie(-20 * 2);
        } else {
            magie(-20);
        }
        if (name.equalsIgnoreCase("Artur")) {
            besiegt();
        } else {
            System.out.println("""
                    Du läufst davon!
                    Weil du nicht König Artur bist!
                    Also geh""" + " " + name);
        }


    }

    private static void weiterMachen() {
        System.out.println("""
                Willst du NICHT weiter machen? :(
                Wenn doch dann drück W! :/
                """);
    }

    private static void richtungKeineAhnung() {
        System.out.println("""
                Bitte Wähle Links(L)
                oder Rechts(R)!
                """);

    }

    private static void besiegt() {

        System.out.println("""
                Du besiegst den Troll mit
                DEINEM SCHWERT!
                                
                                
                Du läufst weiter...
                """);
        System.out.println("""
                Du triffst auf einen freundlichen Elf
                er schenkt dir einen magischen Rubin...
                und ein Schild...
                """);
        kreuzung();
        String richtung = InputUtils.readInput();
        if (richtung.equalsIgnoreCase("L")) {
            richtungL2();
        } else if (richtung.equalsIgnoreCase("R")) {
            richtungR2();
        } else {
            richtungkeineAhnung2();
        }
    }

    private static void kreuzung() {
        System.out.println(name + " du stehst an einer Weggabelung.");
        System.out.println("""
                Willst du nach Links(L) oder
                Rechts(R)?
                """);
    }

    private static void richtungL2() {
        System.out.println("Du erreichst das Ende des dunklen Waldes!");
    }

    private static void richtungR2() {
        System.out.println("Du stößt auf einen Schatz!");
    }

    private static void richtungkeineAhnung2() {
        System.out.println("Du fällst in eine Grube!");
    }
}

