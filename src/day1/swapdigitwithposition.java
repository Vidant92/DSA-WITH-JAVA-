package day1;

public class swapdigitwithposition {
    public static void main(String[] args){
        int num = 15324;
        int position = 0;
        int sum = 0;
        while (num > 0) {
            position++;
            int lastDigit = num % 10;
            sum = sum + position * (int) Math.pow(10, lastDigit - 1);
            num = num / 10;
        }
        System.out.println(sum);

    }
}

