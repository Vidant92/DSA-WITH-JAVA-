package arrays;

public class secondmaxelementinarray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 6, 8, 8,};
        int max = 0;
        int smax = 0; // second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];

            }
            System.out.println(max);
            System.out.println(smax);
        }
    }
}
