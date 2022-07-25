package Bridgelabz.BinaryTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the binary search tree program");
        BinaryTree bst = new BinaryTree();


         // initial node root will point to null here root is empty

        Node root = null;

        //inserting the values in the root by calling the insert method

        root = bst.insert(root, 56);

        root = bst.insert(root, 30);

        root = bst.insert(root, 70);


         //printing the root values

        bst.print(root);
    }
}

