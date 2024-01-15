package stack_queue;

public class Main {
    public static void main(String[] args) {
        // stack implementation test
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
    
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
    
        System.out.println("Is stack empty? " + stack.isEmpty());

        // queue implementation test
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
