// import java.util.*;
package linked_list;

public class Node{
    // for singly linked list
    private Node next;
    // for doubly linked list 
    private Node prev;

    private int value;

    // Constructor
    public Node(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPrev() {
        return this.prev;
    }
    public Node getNext() {
        return this.next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    
}