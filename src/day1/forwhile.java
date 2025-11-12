package day1;

public class forwhile {
    public static void main(String[] args) {
            // for vs while
            for (int j = 1; j <= 10; j++) {
                System.out.print(j);
            }
    System.out.println();
            int i = 1; // start
            while (i <= 100) {
                System.out.print(i);
                if (i % 2 == 0) {
                    i = i + 2;
                } else {
                    i = i + 1;
                }
            }
    }
}
