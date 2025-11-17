package functions;

public class SumOfDigits {
    static void SumOfDigits(int num,int result){
        if(num == 0){
            System.out.println(result);
            return;
        }
       SumOfDigits(num/10,result+num%10);

    }
    public static void main(String[] args) {
        SumOfDigits(1234, 0);

    }
}
