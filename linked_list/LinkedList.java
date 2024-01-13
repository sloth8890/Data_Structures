package linked_list;

public class LinkedList {
    // 0 for singly linked list and 1 for doubly, or circular linked list
    int mode;

    Node head;
    // Constructor
    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    public LinkedList(Node head, int mode) {
        this.mode = mode;
        this.head = head;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    // insertion
    public void insertAtHead(int value) {
        Node node = new Node(value);
        if (head != null) {
            node.setNext(this.head);
            if (mode == 1) {
                head.setPrev(node);
            }
            head = node;
            return;
        }
        this.head = node;
        return;
    }
    public void insertAtTail(int value) {
        Node node = new Node(value);
        Node cursor = this.head;
        if (cursor == null) {
            head = node;
            return;
        }
        while(cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        cursor.setNext(node);
        if (mode == 1) {
            node.setPrev(cursor);
        }
        return;
    }

    public void delete(int value) {
        if (!isEmpty()) {
            if (head.getValue() == value) {
                head = head.getNext();
            } else {
                Node current = head;
                while (current.getNext() != null && current.getNext().getValue() != value) {
                    current = current.getNext();
                }
                if (current.getNext() != null) {
                    current.setNext(current.getNext().getNext());
                }
            }
        }
    }

    public void print() {
        Node cursor = head;
        while(cursor.getNext() != null) {
            System.out.print(cursor.getValue() + " -> ");
            cursor = cursor.getNext();
        }
        if (cursor != null) {
            System.out.println(cursor.getValue());
        }
    }
}
