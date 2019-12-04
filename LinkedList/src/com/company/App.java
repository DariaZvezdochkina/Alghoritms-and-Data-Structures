package com.company;

public class App { //будут создаваться экземпляры класса, элементы в структуре данных
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4; //узел, который будет содержать элемент 4

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        nodeA.next = nodeB; //связали все эти узлы вместе
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println(listLength(nodeA)); //4
        System.out.println(listLength(nodeB)); //3
        System.out.println(listLength(nodeC)); //2
        System.out.println(listLength(nodeD)); //1
    }

    public static int listLength(Node aNode) {  //будет вставленно определнное количество узлов
        int length=0;

        Node currentNode = aNode;
        while (currentNode!=null) { //пока количество связей не закончится
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
}
