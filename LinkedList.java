package com.company;
class LinkedList {

     static Node headOfList;

      static class Node {

         int data;
         Node next;

         Node( int data1) {
         data = data1;
         next = null;
         }
     }


   Node reverseList(Node aNode) {
        Node previous = null;
        Node currentNode = aNode;
        Node next;
        while (currentNode!=null) {
            next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
        }
        aNode = previous;
        return aNode;
    }

    void displayNode (Node aNode) {
         while (aNode != null) {
             System.out.print(aNode.data + " ");
             aNode = aNode.next;
         }
     }

     public static void main(String[] args) {
             LinkedList list = new LinkedList();
             list.headOfList = new Node(1);
             list.headOfList.next = new Node(2);
             list.headOfList.next.next = new Node(3);
             list.headOfList.next.next.next = new Node(4);
             list.headOfList.next.next.next.next = new Node(5);
             System.out.println("Before:");
             list.displayNode(headOfList);
             System.out.println("");
             headOfList = list.reverseList(headOfList);
             System.out.println("After:");
             list.displayNode(headOfList);
     }
 }


