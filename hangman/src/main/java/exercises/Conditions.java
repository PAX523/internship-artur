package exercises;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Conditions {

    public static void main(String[] arg) {

        int x = 3;
        int y = 5;
        boolean XistkleinerY = x < y;
        if (x < y) {

            System.out.println("X ist kleiner als Y");

        } else {

            System.out.println("Y ist kleiner als X");

        }

        System.out.println("Wie alt bist du? ");
        int age = readNumber();
        if (age == 10) {

            System.out.println("Du bist auch 10 Jahre alt? Wie Maro!");

        } else if (age == 14) {

            System.out.println("Du bist so alt wie ich! 14!");

        } else {

            System.out.println("Dein Alter ist jenseits von Gut und Böse!");

        }

        System.out.println("Wie groß bist du?(in cm) ");

        int high = readNumber();
        switch (high) {

            case 160:
                System.out.println("Du bist so groß wie Artur!");
                break;
            case 150:
                System.out.println("Du bist so groß wie Maro! Und kleiner als Artur!");
                break;
            default:
                if (high > 160) {
                    System.out.println("DU BIST GRÖ?ER ALS ICH!");
                } else {
                    System.out.println("Ha du bist kleiner als ICH!");
                }

                break;
        }

        String bruder = "Maro";
        if (bruder.equalsIgnoreCase("maro")) {
            System.out.println("Mein Bruder ist jetzt Tabea!");
        } else {
            System.out.println("Maro ist immer noch mein Bruder!");
        }

    }

    public static String readInput() {
        try (final var baos = new ByteArrayOutputStream()) {
            var letter = System.in.read();
            while (letter != -1 && letter != '\r' && letter != '\n') {
                baos.write((byte) (letter & 0xFF));
                letter = System.in.read();
            }
            return baos.toString(StandardCharsets.UTF_8);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int readNumber() {

        return Integer.parseInt(readInput());

    }
}
