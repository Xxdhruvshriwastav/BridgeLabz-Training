package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {
    	
    	
    	if(q.isEmpty()) {
    		
    		return;
    	}
    	
    	int front = q.remove();
    	
    	reverse(q);
    	
    	q.add(front); 
    	
    	
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Before: " + queue);

        reverse(queue);

        System.out.println("After: " + queue);
    }
}
