package Bridgelabz.BinaryTree1;

public class MainBst1 {
    public static void main(String[] args) {
        System.out.println("Welcome to the binary search tree program");
        BinaryTree1 bst = new BinaryTree1();


         //initial node root will point to null when root is empty

        Node root = null;

        //insert the values in the root by calling the insert method

        root = bst.insert(root, 56);

        root = bst.insert(root, 30);

        root = bst.insert(root, 70);


         //here printing the root values

        bst.print(root);
    }
}
