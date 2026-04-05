package basic;

public class linearsearchfxn {
    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 4, 78};
        int target = 67;
         int ans = ls(nums, target);
        System.out.println(ans);

    }
    public static int ls( int[]arr , int target ) {
    if( arr.length == 0){
        return -1;
    }
    for( int i =0 ; i< arr.length; i++){
        int element  = arr[i];
        if( element == target){
            return i;
        }
    }
    return -1;

    }
}


