package methods;

public class passbyvalueandrefrence {

    public static void change ( int value){
        value = 10;
        System.out.println(value);
    }

    public static void main(String[] args) {
        int x= 16 ;
        System.out.println(x);
        change( x);
        System.out.println( x);

    }
}
