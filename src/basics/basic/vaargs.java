import java.util.Arrays;

public class vaargs {


    /*
    public static void main(String[] args) {

        fun( 5,6,7,8,9);

    }
    static void fun( int...v){
        System.out.println(Arrays.toString(v));
    }

     */


    public static void main(String[] args) {
        multiple( 10 , 39 ,65, " vidant ", " xyz" , " pqr ") ;

    }

    static void multiple( int a , int b, int c, String...v){
        System.out.println(Arrays.toString( v));

    }
    static void multiple( int a , int b, int c, int...v){
        System.out.println(Arrays.toString( v));

    }
}
