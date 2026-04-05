import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {

          /*


           int arr[] = {1, 2, 3, 4, 56, 6};

        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change ( int [] arr1 ) {
        arr1[0] = 10;
        arr1[4]= 7;
    }


     */


        int a = 6;
        System.out.println(a);
        {
            a = 7;       // this can be updated as we already initalized  A outside.

            int b =10;
            System.out.println(b);   // this b cant be used outside the bloack.

        }
        System.out.println(a);
            //    System.out.println(b);
    }

}
