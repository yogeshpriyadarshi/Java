public class BinarySearchTree {

   static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

     static Node insertNode(Node root, int data){
        Node newNode = new Node(data);
        if(root==null){
           root = newNode;
           return root;
        }
        if(root.data > data){
            // left subtree
            root.left = insertNode(root.left, data);
        }else{
            // right subtree
            root.right = insertNode(root.right, data);
        }
        return root;
    }

     static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static boolean search(Node root, int data){
        if(root==null){
            return false;
        }
        if(data == root.data){
            return true;
        }
        if(data > root.data){
            return search(root.right,data);
        }else{
            return search(root.left,data);
        }
    }
    static Node delete(Node root, int data){
        if(data == root.data){
            // delete
            // no child;
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            // both child
            Node suc = successor(root.right);
            root.data = suc.data;
            root.right=  delete(root.right, suc.data);
        }
        if(data>root.data){
         root.right = delete(root.right, data);
        }else{
             root.left = delete(root.left, data);
        }
        return root;

    }
    static Node successor(Node root){
        while(root.left!=null){
            root= root.left;
        }
        return root;
    }





    public static void main(String args[]){
        Node root = null;
         int values[] ={5,9,32,41,62,97,65,15,34,11};
         for(int i=0;i<values.length;i++){
             root= insertNode(root, values[i]);
         }
         inorder(root);

         if(search(root,20)){
              System.out.println("Yes, Number exist in Binary Search Tree!!!");
         }else{
             System.out.println("No, Number doesn't exist in Binary Search Tree!!!");
         }

         root = delete(root,62);
         inorder(root);

    }
    
}
