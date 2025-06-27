package JAVA_DSA_Course;

class Node {
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
        Node left,right = null;
    }
    
}
public class treesesion567 {
    
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void Inorder(Node root){
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if (root == null) {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preorder(root);
        Inorder(root);
        postorder(root);
    }
}