package basics;
import java.util.Scanner;
// greatest of three

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int b = scanner.nextInt();
        System.out.println("Enter the Third Number");
        int c = scanner.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("First Number is Greater");
            } else {
                System.out.println("Third Number is Greater");
            }
        } else {
            if (b > c) {
                System.out.println("Second Number is Greater");
            } else {
                System.out.println("Third Number is Greater");
            }
        }

        // if(true){
        // // Code
        // }
        // else{ // false
        // // Code
        // }
    }
}
