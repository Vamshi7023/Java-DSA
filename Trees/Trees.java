package Trees;

public class Trees {

    static int size = 0;
    static int maxval = 0;
    static int prod = 1;

    public static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }
    // do for inorder and post order

    public static int Size(Node root) {// Finding size of the tree
        if (root == null) {
            return 0;
        }
        size = Size(root.left) + Size(root.right) + 1;

        return size;
    }

    public static int Sum(Node root) {// Finding Sum of the tree
        if (root == null) {
            return 0;
        }
        size = Sum(root.left) + Sum(root.right) + root.data;

        return size;
    }

    public static int max(Node root) {
        if (root == null) {
            return 0;
        }
        maxval = Math.max(maxval, root.data);
        max(root.left);
        max(root.right);

        return maxval;
    }

    public static int min(Node root){
        if (root == null) {
            return Integer.MAX_VALUE;            
        }
        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.right==null || root.right==null) {
            return 0;

        }
        return 1+Math.max(height(root.left), height(root.right));
    }

    public static int product(Node root){
        if (root == null) {
            return 1;            
        }
        product(root.left);
        prod*=root.data;
        product(root.right);
        return prod;
    }

    public static void nthlevel(Node root,int n) {
        if (root == null) {
            return;
        }
        if(n==1) System.out.print(root.data+" ");
        nthlevel(root.left,n-1);
        nthlevel(root.right,n-1);
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        display(root);

        System.out.println(Size(root));

        System.out.println(Sum(root));

        System.out.println(max(root));

        System.out.println(min(root));

        System.out.println(height(root));

        System.out.println(product(root));

        nthlevel(root, 2);
    }
}
