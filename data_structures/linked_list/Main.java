package linked_list;

public class Main {
    // test
    public static void main(String[] args) {
        // Create a linked list
        LinkedList linkedList = new LinkedList();

        // Insert elements at the beginning
        linkedList.insertAtHead(10);
        linkedList.insertAtHead(20);
        linkedList.insertAtHead(30);

        // Display the linked list
        System.out.println("Linked List after inserting at the beginning:");
        linkedList.print();

        // Insert elements at the end
        linkedList.insertAtTail(40);
        linkedList.insertAtTail(50);

        // Display the linked list
        System.out.println("Linked List after inserting at the end:");
        linkedList.print();

        // Delete a specific element
        linkedList.delete(30);

        // Display the linked list after deletion
        System.out.println("Linked List after deleting 30:");
        linkedList.print();
    }
}
