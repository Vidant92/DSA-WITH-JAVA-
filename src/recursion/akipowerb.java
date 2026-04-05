package recursion;

public class akipowerb {
    public static void main(String[] args) {
        int a=2;            // base h ye
        int b = 10;         // exponent h ye
        System.out.println(a+" "+"ki power"+" "+ b+"equalto"+" "+pow(a,b));
    }
    public static int pow(int a, int b){
        if( b ==0)  return 1;
        int call = pow(a,b/2);
        if(b%2==0) return call *call;
        else  return a*call*call;
    }
}
