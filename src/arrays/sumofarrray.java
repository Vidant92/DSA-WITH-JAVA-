package arrays;

import java.util.Scanner;

public class sumofarrray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter size ");
        int n = in.nextInt();
        int[] arr = new int [n];
        for(  int i =0 ; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for( int  i =0 ; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
