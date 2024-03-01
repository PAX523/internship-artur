package exercises;

public class Audo {
    public static void main(String[] udo) {
        //Array = []
        System.out.println("Starte das Spiel");
        System.out.println(udo.length);
        //Zählerschleife
        for (int i = 0; i < udo.length; i++) {
            System.out.println("Parameter: " + udo[i]);

        }

        //For each
        for (String param : udo) {
            System.out.println("Parameter2: " + param);
        }

    }
}

