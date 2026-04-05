package methods;

public class arguments {
    /*public static void sum( int a , int b ){
        System.out.println( a+b );
    }

     */
    public static int  max( int a, int b, int c )          // int return type
    {
        int d = Math.max( c, Math.max(a,b));
        //System.out.println( d );
        return d;

    }

    public static void main(String[] args) {
      //  sum( 3,7);
      // max( 2,5 ,-4 );
        System.out.println( max(2,5,9));
    }
}
