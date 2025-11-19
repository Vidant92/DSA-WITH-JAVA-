package String;

public class ReverseString {
    private static String reverse( String str){
        if(str.length() == 0){
            return "";
        }
        return reverse(str.substring(1)) + str.charAt(0);

//        String oldresult = reverse(str.substring(1));
//        char newResult = str.charAt(0);
//        return oldresult + newResult;

    }

    public static void main(String[] args) {
        String rev = reverse( " VIDANT");
        System.out.println(rev);
    }
}
// reversestringapproach by 2 pointers
// check string is pallindrome HW
