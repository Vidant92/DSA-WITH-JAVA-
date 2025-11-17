package functions;

// sum of digits + factorial

public class Peterson {
    static int Peterson(int num,int org){
       int r= fact(num);
        return r;

    }
    static void Peterson(int num,int sum,int org){
        if(num == 0){
            System.out.println(org == sum ? "peterson no" : " not peterson no"  );
            return;
        }

       Peterson(num/10, sum +fact(num %10), org);
    }
    static int fact( int num){
        if(num ==0){
            return 1;
        }
        return  fact(num-1) * num;
    }
    public static void main(String[] args) {
//        int org = 145;
//        int r =Peterson(org,org);
//        System.out.println(org==r ? "peterson no" : " not peterson no"  );
        Peterson(145,0,145);
    }
}
