package functions;

public class power {
    static void power(int num , int pow, int res){
        if(pow ==0 ){
            System.out.println(res);
            return;
        }
        power(num,pow-1,res *num);
    }
    public static void main(String[] args) {
        power(2,5,1);
    }
}
