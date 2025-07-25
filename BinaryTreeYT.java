import java.util.LinkedList;

public class BinaryTreeYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;    
        }
    }

    public static void preorder (Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+ "  ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println("");
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }else{

            }
        }
    }



    public static void main(){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("print the data of root:=>"+ root.data);
        System.out.print("preorder traversal: => ");
        preorder(root);
        System.out.println(" ");
        System.out.println("inorder traversal: => ");
        inorder(root);
        System.out.print("postorder traversal:=> ");
        postorder(root);
    } 
    
}
