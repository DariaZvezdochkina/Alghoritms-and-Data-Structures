package dataStructureSinglyLinkedList;

public class singlyLinkedList {
    private Node first;
    private Node last;

    public singlyLinkedList() {

    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data) { 
        Node newNode = new Node();  
        newNode.data = data;  
        newNode.next = first; 
        first = newNode; 
    }

    public void insertLast(int data) { 
        Node current = first; 
        while (current.next != null) {
            current = current.next; 
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public Node deleteFirst() { 
        Node temp = first;  
        first = first.next; 
        return temp;
    }

    public void displayList() { 
        System.out.println("List (first node --> last node) ");
        Node current = first;
        while (current!=null) {
            current.displayNode();
            current =current.next;
        }
        System.out.println();
    }
}
