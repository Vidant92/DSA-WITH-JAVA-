package basics;
public class DataTypes {
    int h; // instance variable- object creation time init
    static int h2; // class variable - class load time init

    void show() {
        int k = 100;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int nn = 0;
        System.out.println(nn);
        System.out.println(h2);
        int x = 99; // local variable has to initialize by own
        int y = 22;
        System.out.println(x + y);
        // Primitive
        // Non Decimal
        byte e = (byte) 130; // 1 byte // byte literal
        System.out.println(e);
        short g = 200; // 2 byte
        int h = 50000; // 4 byte
        long j = 54353L; // 8 byte // long literal

        // Decimal
        float hh = 99.20f; // 4 byte
        double h4 = 90.20; // 8 byte

        char g1 = 'A'; // 2 byte - UTF UNICODE
        char g2 = 'न';

        boolean att = true; // 1 or 0 - 1 / 2 byte
        System.out.println(g1 + " " + g2);

        var a = 100;
        var b = 20.90;

        int c = 90;

        // Constants
        final int MAX = 100; // ALL CAPS
        // MAX=200;

    }
}