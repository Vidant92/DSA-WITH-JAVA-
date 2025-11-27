package recursion;
// if a string is there amit then we have to write all the sub sequences in
// increasung order of string
//ex  amit , ami, am,a ," "(empty)  -- valid
// ex tim , ti , ta -- all are invalid

public class subSequence {
    static void subseq(String str , String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        subseq();

    }
    public static void main(String[] args) {
        subseq("amit", " ");
    }
}
