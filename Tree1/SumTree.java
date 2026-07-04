public class SumTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild=transform(root.right);
        
        int data=root.data;
        
        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.left==null?0:root.right.data;
        
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }

    public static void print(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);

        transform(root2);
        print(root2);
    }
}
