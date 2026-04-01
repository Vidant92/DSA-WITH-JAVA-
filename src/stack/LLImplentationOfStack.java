package Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek(){ // we can write in both ways either throws exception or return type
        if(head==null){
            System.out.println(" stack is empty");
            return -1;
        }
        return head.val;
    }
    int pop() throws Exception{ // deleteAtHead
        if(head==null){
            throw new Exception("Stack Underflow Error"); //isme return keyword nhi likhna psdega
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    void push(int ele){ // addAtHead
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LLImplentationOfStack {
    public static void main(String[] args) throws Exception { // main m bhi lgana pdega throws exception to use this 
        MyStack st = new MyStack();
        // st.pop();  we cant call it gives underflow error and code will not work
        st.push(10); st.push(20); st.push(30); st.push(40);
        st.display();

        st.pop();
        //st.pop();
        st.display();
    }
}