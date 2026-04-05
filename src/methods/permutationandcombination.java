package methods;
import java.util.Scanner;

public class permutationandcombination {
    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        int ncr = fact(n) / fact(r) * fact(n - r);
        System.out.println(ncr);
    }
}



