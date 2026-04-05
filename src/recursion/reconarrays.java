package recursion;

public class reconarrays {
    public static void main(String[] args) {
        int[] arr ={ 2,3,4,5,6,7,8,9};
        recarr(arr,0);
    }
    public static void recarr(int[] arr, int idx){

        if( idx== arr.length)  return ;

        System.out.println(idx) ;    // index print kr do
        recarr(arr,idx +1);    //bbaaki recursion print kr lega
     }
}
