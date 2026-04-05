package basicsorting;

public class selectionsort {
    public static void main(String[] args) {


        int[] arr = {1, 9, 5, 6, 6, 7, 9, 2, 3};
        int n = arr.length;
        arrprint(arr);

        for( int i = 0;i< n-1 ; i++){  //n-1 passes
            int min = Integer.MAX_VALUE;
            int mindx = -1; // stores min wale ka index in itself so we can swap it with 1 index
            for(int j=i; j<n ; j++){
                if( arr[j] < min){
                    min = arr[j];
                    mindx =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;


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
