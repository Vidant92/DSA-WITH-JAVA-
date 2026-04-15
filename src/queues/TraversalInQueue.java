package Queues;
import java.util.LinkedList;
import java.util.Queue;
public class TraversalInQueue {

    private static void display(Queue<Integer> q){
        int n = q.size();
        for(int i = 0; i < n; i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        display(q);

        addAtIndex(q, 2, 60);
        display(q);

        System.out.println("Peek at index 3: " + peek(q, 3));
        System.out.println("Removed at index 2: " + remove(q, 2));

        display(q);
    }

    //  ADD at index
    private static void addAtIndex(Queue<Integer> q, int idx, int val) {
        if(idx < 0 || idx > q.size()){
            System.out.println("Invalid Index!");
            return;
        }

        int n = q.size();

        // rotate till idx
        for(int i = 0; i < idx; i++){
            q.add(q.remove());
        }

        // add element
        q.add(val);

        // restore remaining
        for(int i = 0; i < n - idx; i++){
            q.add(q.remove());
        }
    }

    //  PEEK using same logic
    private static int peek(Queue<Integer> q, int idx) {
        if(idx < 0 || idx >= q.size()){
            System.out.println("Invalid Index!");
            return -1;
        }

        int n = q.size();

        // rotate till idx
        for(int i = 0; i < idx; i++){
            q.add(q.remove());
        }

        // peek element
        int val = q.peek();

        // restore queue
        for(int i = 0; i < n; i++){
            q.add(q.remove());
        }

        return val;
    }

    //  REMOVE using same logic
    private static int remove(Queue<Integer> q, int idx) {
        if(idx < 0 || idx >= q.size()){
            System.out.println("Invalid Index!");
            return -1;
        }

        int n = q.size();

        // rotate till idx
        for(int i = 0; i < idx; i++){
            q.add(q.remove());
        }

        // remove element
        int val = q.remove();

        // restore remaining
        for(int i = 0; i < n - idx - 1; i++){
            q.add(q.remove());
        }

        return val;
    }
}