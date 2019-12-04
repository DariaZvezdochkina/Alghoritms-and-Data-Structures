package dataStructureSinglyLinkedList;

public class App {
    public static void main(String[] args) {
        singlyLinkedList myList = new singlyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(99999999);

        myList.displayList();
    }
}
