public class swap {
    public static void main(String[] args) {
        int a = 2;
        int b= 3;
        swap( a,b );

        System.out.println(" main function ki value change na hui h");
       System.out.println( a + " " + b);
    }
    static void swap ( int a , int b){
        int temp = a ;
        a =b;
        b = temp;                   // bass niche wale method m swap hoga

        System.out.println( a + " " + b);
        System.out.println(" function band ");

    }
}


/*
this code is not working
 When you call swap(a, b);,
 Java copies the values of a and b and passes those copies
 into the swap method. Inside the swap method, you're
 swapping the copies,
 not the original variables in main.
 So the changes are not reflected outside the method.


 we should use a wrapper  class in this eg ARRAY

 */

/*
 public class Swap {
 public static void main(String[] args) {
        int[] nums = {2, 3};
        swap(nums);
        System.out.println(nums[0] + " " + nums[1]);
    }

    static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}   */

