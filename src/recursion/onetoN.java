package recursion;

import java.util.Scanner;

public class onetoN {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter any no");
        int n = in.nextInt();
        print( 1,n);
    }
    public static void print( int x,int num){
        if ( x>num )  return;

        System.out.println(x);
        print(x+1,num);

    }

    }

