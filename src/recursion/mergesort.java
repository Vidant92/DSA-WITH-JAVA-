package recursion;
  public class mergesort {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 7, 8, 4, 5, 1 };
        mergesort(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;

        // Step-1: create two arrays
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step-2: copy elements into a and b
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
 // Step-3: recursion
        mergesort(a);
        mergesort(b);
 // Step-4: merge into original
        merge(a, b, arr);
    }
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}

