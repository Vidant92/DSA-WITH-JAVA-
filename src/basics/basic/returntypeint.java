import java.util.Scanner;


public class returntypeint {


        public static void main(String[] args) {
            int ans = sum();
            System.out.println( " ans is " + ans );

        }
        static int  sum(){                   // static returntype function name
            Scanner in = new Scanner(System.in);
            System.out.println(" enter num 1 ");
            int num1 = in.nextInt();

            System.out.println(" enter num 2 ");
            int num2 = in.nextInt();

            int sum = num1 + num2 ;
            return sum ;






        }
    }

