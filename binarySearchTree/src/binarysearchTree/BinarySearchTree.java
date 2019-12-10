package binarysearchTree;

public class BinarySearchTree {

    private Node root;

    public void insert(int key,String value) {

        Node newNode = new Node(key, value);

        if (root == null) { //if we don't have a tree yet and smb inserted the first node
            root = newNode;
        } else {
            Node current = root;  //traversal variable
            Node parent;  //the parent of the current node

            while (true) {
                parent = current;
                if (key < current.key) { //left side scenario (if the key of inserted node is less than the key of the current node)
                    current = current.leftChild; //we move current to the left side
                    if (current == null) {  //it's parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                    } else {  //right side scenario
                        current = current.rightChild;
                        if (current == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                }
            }
        }


    public Node findMin() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean remove(int key) {

        Node currentNode = root; //are going to change as we proceed to what we are trying to move
        Node parentNode = root;

        boolean isLeftChild = false;  // to determine whether the note we are trying to delete is a left child

        //searching to find the node with the key to delete
        while (currentNode.key != key) {
            parentNode = currentNode;
            if (key < currentNode.key) {
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                isLeftChild = false;
                currentNode = currentNode.rightChild;
            }
            if (currentNode  == null) {
                return false;
            }
        }
        //found the node
        Node nodeToDelete = currentNode;

        //if node is a leaf

        if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            if (nodeToDelete == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        }

        //if node has one child that is on the left
        else if (nodeToDelete.rightChild == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.leftChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild =nodeToDelete.leftChild;
            }
        }

        //if node has one child that is on the right
        else if (nodeToDelete.leftChild == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.rightChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild =nodeToDelete.rightChild;
            }
        }
        //if node has two children
        else {

            Node successor = getSuccessor(nodeToDelete);

            //connect the parent if the node to delete to successor instead
            if (nodeToDelete == root) {
                root = successor;
            } else if(isLeftChild) {
                parentNode.leftChild = successor;
            } else {
                parentNode.rightChild = successor;
            }
            successor.leftChild = nodeToDelete.leftChild;

        }

        return true;
    }

    private Node getSuccessor(Node nodeToDelete){
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;

        Node current = nodeToDelete.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        if (successor != nodeToDelete.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }
        return successor;
    }
}
