package arrays;
import java.util.Arrays;        // we have to include this to sort
public class sortarraybuiltin {
    public static void main(String[] args) {
        int[] arr= { 1,2,3,8,9,6,-3,7};
        //sort - ascending order
        print(arr);
        Arrays.sort(arr);
        System.out.println(" sorted array");
        print(arr);

    }
    public static void print( int[] nums ){
        for( int i =0; i< nums.length; i++){
            System.out.print( nums[i] + "  ");
        }
    }
}
