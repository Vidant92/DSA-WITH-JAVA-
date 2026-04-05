package basicsorting;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 6, 6, 7, 9, 2, 3};
        int n = arr.length;
        arrprint(arr);

        for( int i=0 ; i< n-1; i++){
            //  int swaps=0;    swap lgane se code or optimized ho jyega
            for( int j=0 ; j< n-1-i; j++) {             //  already sorted array k liye better rhega
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                   // swaps ++;

                }
            }
           // if(swaps ==0 )  break;
        }
        System.out.println();
        arrprint(arr);

    }
    public static void arrprint(int[] arr) {
        for (int element : arr) {
            System.out.print(element + "  ");
        }
    }
}
