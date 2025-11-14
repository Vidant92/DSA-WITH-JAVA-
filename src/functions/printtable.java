package functions;

public class printtable {
    static void printtable(int num, int range){
        if(range==0){
            return ;
        }
        printtable(num, range-1);
        System.out.println(num + "x" +range + "=" + (num * range));


    }
    public static void main(String[] args) {
        printtable(5,10);

    }
}
