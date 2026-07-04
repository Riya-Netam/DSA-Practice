public class MinDistance {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static Node lca2(Node root, int n1, int n2){
        
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftLca=lca2(root.left, n1, n2);
        Node rightLca=lca2(root.right, n1, n2);

        //leftLCA=val rightLca=null
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }

        return root;

    }

    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }

        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        else if(leftDist==-1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
    }

    public static int distance(Node root,int n1,int n2){
        Node lca=lca2(root, n1, n2);

        int dist1=lcaDist(root,n1);
        int dist2=lcaDist(root,n2);

        return dist1+dist2;
    }

    public static void main(String[] args) {
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.right = new Node(6);
        root2.right.right.right = new Node(7);

        int n1=4,n2=6;
        System.out.println(distance(root2, n1, n2));
    }
}
