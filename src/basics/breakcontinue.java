package basics;
// continue - skip the current iteration loop se bahr nhi hoga
// break - current loop se bahr nikal deta h
public class breakcontinue {
    public static void main(String[] args) {
        abcd: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    // break;
                     continue abcd;
                    //break abcd;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
