package OOPS;
import java.util.Scanner;

// ye jo class student h vo kisi bhi oops package m use ho skti h
// we can access this class in any folder without accessing it
//ye class humne main wali class se alag bnayi h taaki used in all package

class Student{ // khudka ek data type bana liya hai
    String name;
    int rno;
    double cgpa;
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
}
public class userdefined {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(); // declaration // new object bnaya
        s1.name = "Khushi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student(); // declaration //  ek or object bnaya
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;

        Student s3 = new Student(); // declaration // ek or object bnaya
        s3.name = "Anagha";
        s3.rno = sc.nextInt();
        s3.cgpa = 9.37;

        System.out.println(s1.name + " " + s1.cgpa + " " + s1.rno);
        s2.cgpa = 9.8;
        System.out.println(s3.rno);

        s1.print(); // inbuilt fxn h class ko use krne ka
        s2.print();
        s3.print();

      //  print(s1); print(s1); print(s1); // uses vo fxn jo niche bnaya h
        // isme vlaue pass bhi kr rhe h
    }

    private static void print(Student s) {
        System.out.println(s.name + " " + s.rno + " " + s.cgpa);
    }
}

