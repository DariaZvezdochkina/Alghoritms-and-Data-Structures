package dataStructureSinglyLinkedList;

public class singlyLinkedList {
    private Node first;
    private Node last;

    public singlyLinkedList() {

    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data) { //используется для вставки узла в начало списка
        Node newNode = new Node();  //новый узел который будет в структуре данных
        newNode.data = data;  //данные которые будут записаны в эту структуру
        newNode.next = first; //новый узел должен соединяться с узлом который раньше был первым
        first = newNode; //мы указываем на то что новый узел становится первым
    }

    public void insertLast(int data) { //используется для вставки узла в конец списка
        Node current = first; //создаем текущий узел который будет первым
        while (current.next != null) {
            current = current.next; //мы будем проходить через цикл пока current.next не станет null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public Node deleteFirst() { //используется для удаления из начала списка
        Node temp = first;  //для этого нам нужна переменная которая будет указывать на какой либо первый узел
        first = first.next; //должны изменить все на что указывает эта переменная..таким образом мы указываем на следующее поле справа удаляя все данные о предыдущем узле
        return temp;
    }

    public void displayList() { //будет распечатывать содержимое списка
        System.out.println("List (first node --> last node) ");
        Node current = first;
        while (current!=null) {
            current.displayNode();
            current =current.next;
        }
        System.out.println();
    }
}
