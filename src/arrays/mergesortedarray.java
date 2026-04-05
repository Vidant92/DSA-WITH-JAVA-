package arrays;

public class mergesortedarray {
    public static void main(String[] args) {
        int[] a = { 1,2,3,4};
        int[] b = { 3,4,5,6,7};
        int[] c = new int[a.length + b.length];
        for( int element :c){
            System.out.print(element + "  ");
        }
        System.out.println("  ");
        merge(c,a,b);
        for( int element : c){
            System.out.print(element + "  ");
        }
    }
    public static void  merge(int[] c , int[] a , int[] b ){
        int i =0, j=0, k=0 ;
        while (i<a.length && j<b.length){
            if( a[i] < b[j] ){
                c[k] = a[i];
                i++;
                k++;
            }
        else{
            c[k] = b[j];
            j++;
            k++;
        }
    }

            while( i< a.length){  // agar a ke elements bache h to ye aayega
                c[k]= a[i];
                i++;
                k++;

            }

        while( j< b.length) {    // agar b k bache h to ye aayega 
            c[k] = b[j];
            j++;
            k++;
        }


    }
}
