public class fxnovrloading {
    public static void main(String[] args) {
        int ans = sum ( 10 , 30 ,20 , 40 );
        System.out.println(ans);
    }
    static int  sum ( int a, int b, int c){
        int  sum  = a + b +c ;          // for 3 values
        return sum;
    }

    static int sum ( int a, int b, int c, int d ){
        int  sum  = a + b +c +d ;          // for 4 values
        return sum;
    }
}
