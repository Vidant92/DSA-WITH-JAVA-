import java.util.Scanner;


public class argumentpass {


    //
    // public static void main(String[] args) {
      //  int ans = sum(7,3 );
      //  System.out.println(" ans is "+ ans );
   // }
  //  static int sum( int a , int b){
      //  int sum = a+b ;
     //   return sum;
  // }






   // public static void main(String[] args) {
     //   String message = greet(  " vidant" ) ;
       // System.out.println(message);
    //}
    //static String greet( String name ){
      //   String message = " hello " + name;
        // return message;
    //}





    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter your name ");

        String name = in.next();
        String message = greet(  name ) ;
        System.out.println(message);
    }
    static String greet( String name ){
        String message = " hello " + name;
        return message;
    }
}
