package BinaryTree2;

class Node {
    int data;
    Node left;
    Node right;
}

public class BinaryTree2 {
    public Node insert(Node root, int val) {
        if (root == null) {
            return craeteNewNode(val);
        }

        // if value is lesser then root data value then it will insert a root value to the left side

        if (val < root.data) {
            root.left = insert(root.left, val);
        }
        //if value is greater then root data value then it will insert a root value to the right side

        else if (val > root.data) {
            root.right = insert(root.right, val);
        }
     return root;

}


public Node craeteNewNode(int k) {
        Node bst = new Node();
        bst.data = k;
        /*
         * both left and right root data's are null
         */
        bst.left = null;
        bst.right = null;
        return bst;
        }

public void print(Node root) {
        if (root == null) {
        return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
        }
}
