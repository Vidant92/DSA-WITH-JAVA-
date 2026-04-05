package methods;
import java.util.Scanner;
public class builtin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // math wale
        //System.out.println(Math.sqrt(4));
        //System.out.println(Math.cbrt(100));
        System.out.println(" enter 3 no ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(  Math.max( d,Math.max(c ,Math.max(a,b))));



    }
}
