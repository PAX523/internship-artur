package exercises;

public class DataType {
    public DataType(String name, int size) {
        System.out.println(name);
        System.out.println(size);
    }

    public static void main(String[] arguments) {
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 8;

        float f = 4.0f;
        double d = 8.0;

        char c = 'g';
        i = c;
        System.out.println(i);

        boolean b2 = true;

        String s2 = "s2";

        DataType dt = new DataType("integer", 4);
        DataType dt2 = new DataType("Integ", 2);
    }

}
