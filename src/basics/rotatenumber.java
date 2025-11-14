package basics;
// n = 12345  rotate=2
// ist  --- 51234
// 2nd --45123 ans

import java.util.Scanner;

public class rotatenumber {
    public static void main(String[] args) {
// simple approach without while
//        int n = 12345;
//        int rotate = 2;
//        int last = n % 100;
//        n = n / 100;
//        last = last * 1000;
//        n = last + n;
//        System.out.println(n);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt(); // assume 12345
        System.out.println("Enter the Rotations");
        int r = scanner.nextInt();

        int copy = num;
        // Step - 1 Count the Digit
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // make number small;
        }
        r = r % count; // within range
        num = copy;
        int rightPart = num % (int) Math.pow(10, r);
        int leftPart = num / (int) Math.pow(10, r);
        // System.out.println(rightPart + "" + leftPart);
        int result = rightPart * (int) Math.pow(10, count - r) + leftPart;
        System.out.println(result);
        scanner.close();

    }
}
