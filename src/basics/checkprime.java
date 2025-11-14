package basics;
//count prime krna h leetcode
// chech prime by optimatation approach also
public class checkprime {
    public static void main(String[] args) {
        int num = 17;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return; // exit from the function
            }
        }
        System.out.println("Prime Number");
        // int factor = 0;
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // factor++;
        // }
        // }
        // if (factor == 2) {
        // System.out.println("Prime Number");
        // } else {
        // System.out.println("Not Prime Number");
        // }
    }
}

