package Trees;

import java.util.*;

public class Trees2 {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }

    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root!=null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            Node temp = q.peek();
            if (temp.left!=null)q.add(temp.left);

            if (temp.right!=null)q.add(temp.right);
            
            System.out.println(temp.data);
            q.remove();
        }

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

        bfs(root);


        // leetcode 110
    }
    
}
