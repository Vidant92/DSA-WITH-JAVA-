package arrays;
import java.util.Scanner;
public class outputinputarray {
    public static void main(String[] args) {
        /* int[] arr = new int [7];
        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }  */



     /*   Scanner in = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i=0 ; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for (int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }       */


        Scanner in  = new Scanner(System.in) ;
        System.out.println(" enter size of array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for( int i=0 ; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for( int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i]+ " ");;
        }


    }
}
