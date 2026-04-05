package methods;

public class returntype {
   /*  public static int person(){
        System.out.println(" hello world ");
        System.out.println(" hello world ");
        return 5;
    }

    */

    public static int person(int a) {
        System.out.println(" hello world ");
        System.out.println(" hello world ");

        if (a > 5) return 100;
        else return 0;
    }


    public static void main(String[] args) {
        int x = person( 7);
        System.out.println(3+x);

    }
}

