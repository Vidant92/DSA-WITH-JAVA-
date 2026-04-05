package arrays;

public class passingarraytomethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[2 ]);
        change(arr);
        System.out.println(arr[2]);
    }

        public static void change( int[] y){
            y[2] = 50;
        }
    }

