package arrays;

public class linearsearch {
    public static void main(String[] args) {
         int[] arr = { 7,0,3,9,5,6};
        int target= 6;
        boolean found  = false; // we assume target array m nhi h
        for (int i=0; i<arr.length; i++){
            if ( arr[i] == target){
                System.out.println(" element found in array at index"+ " " +i);
                found = true;
                break;
            }
         }
        if( found == false){
            System.out.println(" element does not found ");

        }
        else{
            System.out.println(" element found ");
        }
    }
}
