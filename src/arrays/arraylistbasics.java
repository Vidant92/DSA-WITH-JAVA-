package arrays;



import java.util.ArrayList;

public class arraylistbasics {
    public static void main(String[] args) {
        ArrayList< Integer> arr = new ArrayList<>();
        arr.add( 10 );
        arr.add( 120 );
        arr.add( 130 );
        arr.add( 140 );
        arr.add( 1050 );
        System.out.print(arr.get(4));
        arr.set(2,400);
        System.out.print(arr.get(2));
        System.out.println(arr);

        int n = arr.size();
        for( int i =0 ; i<n ; i++){
            System.out.print(arr.get(i) + "  ");

        }
        for ( int  element  : arr){
            System.out.print(element + "  ");
        }
    }

}
