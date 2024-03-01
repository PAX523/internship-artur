package exercises;

public class Loops {
    public static void main(String[] args) {

        for (int i = 10; i <= 100; i += 10) {
            System.out.println(i);

            System.out.println("hälfte " + i / 2);
        }
        System.out.println("Irgendwas");

        int j = 10;


        for (int i = 0; i <= 10; i++) {
            System.out.println(++j);

        }
    }
}
