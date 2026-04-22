package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // add elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Original Queue: " + q);

        ReverseQueue obj = new ReverseQueue();
        q = obj.reverseQueue(q);

        System.out.println("Reversed Queue: " + q);
    }

    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        // queue se stack
        while(!q.isEmpty()){
            st.push(q.remove());
        }

        // stack se queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        return q;
    }
}
