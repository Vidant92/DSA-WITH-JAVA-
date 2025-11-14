package functions;

public class methoddemo {
    public static void main(String[] args) {
        show(2,5);
    }
    private static void show( int x, int y){
        int c = x +y;
        System.out.println("ans is " + c);
    }
}

/*
package functions;

public class methoddemo {
    public static void main(String[] args) {
        show(2,5); // here we jhave to make static function or object
    }

    private int  void show(int x, int y){ // this is wrong we cant create direct function
        int c = x + y;
        System.out.println("ans is " + c);
    }
}

 */