package recursion;

public class towerofhanoi {
    public static void main(String[] args) {
        int n =3;
        hanoi(n,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;

        hanoi(n-1,a,c,b); //a to b via c

        System.out.println( a+" -> "+ c);       // this is wrong recursive call  hanoi(n,a,b,c);

        hanoi(n-1,b,a,c);     // b to c via a
    }
}
