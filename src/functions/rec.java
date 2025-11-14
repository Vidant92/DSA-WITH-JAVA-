package functions;

public class rec {
    public static void main(String[] args) {
        show( 4);
    }
   private static void show(int n){
        if(n==0) return;
       System.out.println(" Indian is great");
       show(n-1);
   }

}
