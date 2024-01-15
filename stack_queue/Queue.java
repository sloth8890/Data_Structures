package stack_queue;

import java.util.EmptyStackException;

public class Queue {
    private int[] array;
    private int size;
    private int front;
    // last element
    private int rear;

    public Queue(int capacity) {
        array = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (size == array.length) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % array.length;
        array[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int removedValue = array[front];
        front = (front + 1) % array.length;
        size--;
        return removedValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
