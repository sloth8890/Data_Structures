# Linked List

Linked Lists are the data structure that elements are stored in nodes and points to the next ndoe in sequence. There are different types of linked list and each of them has their own characteristics. 
## Types

### Singly Linked List:

- Each node contains data and a reference (link or pointer) to the next node in the sequence. 
- The last node typically points to null to signify the end of the list.



### Doubly Linked List:

- Each node contains data and has references to both the next and the previous nodes in the sequence.
- This allows for easier traversal in both directions compared to a singly linked list.

### Circular Linked List:

- Similar to a singly linked list, but the last node points back to the first node, creating a loop.
- Circular linked lists can be either singly or doubly linked.


## Operations

Traversing a linked list
```java
Node ptr = head;
while(ptr != NULL) {
    /*
    some operation
    */
    ptr = ptr.next;
}
```

