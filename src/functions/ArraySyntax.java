package functions;
import java.util.ArrayList;

    class X {
        int arr[] = new int[10]; // 40 Byte
        int e[] = new int[] { 10, 20, 30, 40 }; // 16
        String x = new String("Hello");
    }

    class ArraySyntax {
        public static void main(String[] args) throws Exception {
            // int h[] = new int[10];
            // for(int i = 0; i<h.length; i++){
            // System.out.println(h[i]);
            // }
            // for(int b : h){
            // System.out.println(b);
            // }
            int twod[][] = new int[3][3];
            int[] q[] = new int[3][4];
            int[][] e = new int[3][4];
            int h[][] = { { 10, 20, 30 }, { 90, 100, 11 } };
            int n[][] = new int[3][];
            n[0] = new int[10];
            n[1] = new int[20];
            n[2] = new int[30];
            for (int arr[] : n) {
                for (int b : arr) {
                    System.out.print(b);
                }
                System.out.println();
            }
            // for (int i = 0; i < n.length; i++) {
            // for (int j = 0; j < n[i].length; j++) {
            // System.out.print(n[i][j]);
            // }
            // System.out.println();
            // }
            // ArrayList<X> list = new ArrayList<>();
            // System.out.println("Start");
            // while (true) {
            // X obj = new X();
            // list.add(obj);
            // Thread.sleep(50);
            // }
            // int arr[] = new int[10]; // fill with 0
            // int c[] = { 10, 20, 30, 40 };
            // int[] d = { 90, 100, 200, 300 };
            // int e[] = new int[] { 10, 20, 30, 40 };
            // System.out.println(e.toString()); // ClassName@HashCode(HexaDecimal)
            // boolean a[] = new boolean[10]; // fill with false
            // String b[] = new String[10]; // fill with null

        }
    }
