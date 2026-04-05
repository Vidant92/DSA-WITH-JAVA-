package arrays;
import java.util.Scanner;

public class printnegativenumber {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in) ;
        System.out.print(" enter size of array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for( int i=0 ; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for( int i=0 ; i< arr.length ; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                ;
            }
        }

    }
}
