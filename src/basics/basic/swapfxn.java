public class swapfxn {
     static void swap( int[] number) {

         int temp = number[0];
         number[0] = number[1];
         number[1] = temp;
     }


    public static void main(String[] args) {
        int[] nums = { 5, 10 };
        System.out.println( " before swapping  a=" + nums[0] +  " "  +  " b=" + nums[1]);
        swap( nums );
        System.out.println (" after swap b=  " + nums[0] + "  b = " +nums[1]);

    }
}
