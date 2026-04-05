package arrays;

//HW: Multiply odd indexed elements by 2 and add 10 to even indexed elements

public class practiceques1 {
    public static void main(String[] args) {
        int[] nums = {7,5,6,7, };
        for (int i=0; i< nums.length;i++){
            if ( i %2 == 0){                            // if index is even
                System.out.print(nums[i] +2 + "  ");
            }
            else {
                System.out.print( nums[i] *2 + "  ");
            }
        }
    }
}
