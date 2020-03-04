package BinaryTree;

public class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}

// A Java program to introduce Binary Tree
class BinaryTree {
    // Root of Binary Tree
    Node node;

    // Constructors
    BinaryTree(int key) {
        node = new Node(key);
    }

    BinaryTree() {
        node = null;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        /*create root*/
        binaryTree.node = new Node(1);

        /* following is the tree after above statement

              1
            /   \
          null  null     */

        binaryTree.node.left = new Node(2);
        binaryTree.node.right = new Node(3);

        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */


        binaryTree.node.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
    }
}