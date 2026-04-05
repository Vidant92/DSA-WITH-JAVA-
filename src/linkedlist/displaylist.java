package linkedlist;
import java.util.Scanner;
/*
package same h islye hum ye nhi likh rhe h otherwise likhna pdega
class Node{
    int val;
    Node next;
    Node(int x){
        this.val=x;
    }
}
 */

public class displaylist {
        public static void displayRec(Node head){
            if(head == null) return;
            displayRec(head.next);
            System.out.print(head.val+" ");

            // aab linked list ko seeda print krega
            //displayRec(head.next);
            //System.out.print(head.val+" ");
        }
        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.val+" ");
                temp = temp.next; // VERY IMPORTANT
            }
            // while ki jagah for loop se bhi print krwa skte h
            // for(Node temp = head;temp != null;temp = temp.next){
            //System.out.print(temp.val+" ");
            //}
            //System.out.println();
        }
        public static void main(String[] args) {
            Node a = new Node(10); // head node
            Node b = new Node(200);
            Node c = new Node(30);
            Node d = new Node(40);
            Node e = new Node(50);
            a.next = b; b.next = c;
            c.next = d; d.next = e;
            display(a);
            displayRec(a);
            System.out.println(get(a,4));
//        Node n = null;
//        n.val = 10;
//        System.out.println(n.val);
//        System.out.println(n.next);
        }

        private static int get(Node head, int idx) {
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            /*
            // ye bhi same hi h yha 0 based indexing kr rhe h last ko exclude krke
             for(int i=0;i<idx;i++){
                temp = temp.next;
            }
             */
            return temp.val;
        }
}
