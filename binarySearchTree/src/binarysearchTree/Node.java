package binarysearchTree;


public class Node {  //storage container that is going to contain numbers and values

    int key;
    String value; //data in the node
    Node leftChild, rightChild;

    public Node(int key, String value) {
        super();
        this.key = key;
        this.value = value;
    }
}
