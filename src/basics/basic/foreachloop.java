package basic;

public class foreachloop {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4};
        for(int i= 0 ; i< arr.length ; i++){
            arr[i] = arr[i]*2;
        }
        for( int element : arr){              // for each loop
            System.out.println( element );
        }
    }
}
