package binarysearchTree;

public class App {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10, "Ten");
        tree.insert(20, "Twenty");
        tree.insert(30, "Thirty");

        System.out.println(tree.findMin().key);
        System.out.println(tree.findMax().key);

        System.out.println(tree.remove(10)); //print true
        System.out.println(tree.findMin().key);  //20


    }
}
