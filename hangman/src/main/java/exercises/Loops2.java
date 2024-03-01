package exercises;

public class Loops2 {

    public static void main(String[] args) {

        int x;
        for (x = 0; x < 10; x++) {

            System.out.println("Grabe " + (x + 1) + " in den Boden");

        }

        String[] map = {"Wald", "Höhle", "Fluss", "Berg"};
        map = new String[]{"Wald", "Höhle", "Fluss", "Berg"};
        for (String place : map) {

            System.out.println("Ich grabe am Ort " + place + ".");

        }

        int treasures = 5;
        while (treasures > 0) {
            System.out.println("Wir haben bisher " + (5 - treasures) + " Schätz/e gefunden!");
            treasures = treasures - findeSchatz();
        }

        do {
            System.out.println("Wir haben bisher " + treasures + " Münzen gefunden!");
            treasures = treasures + findeSchatz();
        } while (treasures <= 5);

    }

    private static int random(int start, int end) {
        return (int) (Math.random() * (end - start) + start);
    }

    private static int findeSchatz() {

        return (random(0, 2));

    }
}
