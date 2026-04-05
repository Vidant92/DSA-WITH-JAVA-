package OOPS;
import java.util.Arrays;
//isme change ho skta h array m values
public class passarraytoconstructor {
        public static class StudentData {
            String name;
            int rno;
            int[] marks;

            //  Constructor that stores reference to the same array
            StudentData(int[] s) {
                marks = s; // no copy, direct reference
            }

            StudentData(int s) {
                marks = new int[s];
            }
        }

        public static void main(String[] args) {
            int[] arr = {4, 7, 1, 4, 8};
            StudentData s1 = new StudentData(arr);

            s1.marks[0] = 40; // modify through object

            System.out.println(arr[0]); // check if original array changed

            StudentData s2 = new StudentData(2);
            s2.marks[0] = 40;
            s2.marks[1] = 60;

            System.out.println(Arrays.toString(s2.marks));
        }
}

