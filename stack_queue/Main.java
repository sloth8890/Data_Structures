package stack_queue;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
    
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
    
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
