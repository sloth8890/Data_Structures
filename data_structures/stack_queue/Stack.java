package stack_queue;

import java.util.EmptyStackException;

public class Stack {
    private int size;
    private int top;

    private int[] array;
    

    public Stack(int capacity) {
        array = new int[capacity];
        size = capacity;
        top = -1;
    }
    // basic operations
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Overflow!");
            return;
        }

        array[++top] = value;
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top--];
    }
    // helper methods
    public boolean isEmpty() {
        return top == -1;
    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }
    public int size() {
        return top + 1;
    }



    
}
