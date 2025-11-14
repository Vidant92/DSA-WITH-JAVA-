package basics;
// 1 se 5 tk print krna h in order 1 2 3 4 5
public class printdigit {
    public static void main(String[] args) {
        int num = 12345; // any number
        int copy = num;
        int count = 0;
        // 12345/10000 = 1 - Get the first digit
        // Count the Digit
        while (num > 0) {
            num = num / 10; // make the number small
            count++;
        }
        // System.out.println(count);
        int pow = (int) Math.pow(10, count - 1);
        num = copy;
        while (num > 0) {
            int firstDigit = num / pow;
            System.out.println(firstDigit);
            num = num % pow; // remove the first digit
            pow = pow / 10;
        }
    }
}
