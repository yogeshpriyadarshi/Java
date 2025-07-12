public class UniqueSubstring {

    static  class Node{
        Node[] children = new Node[26];
        boolean  eow;
    }
    static Node root = new Node();

    static void insertion(String word){
        Node curr = root;
        for(int i=0; i<word.length();i++){
            int idx= word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }

    static int countNode(Node curr){
        if(curr==null) return 0;
        int count =0;
        for(int i=0; i<26;i++){
            if(curr.children[i]!=null){
                count++;
               count+= countNode(curr.children[i]);
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str= "ababa";
        for(int i=0; i<str.length();i++){
            insertion(str.substring(i));
        }

        // count number of node for answer
        int count =1;
         count+=countNode(root);

        System.out.println(str + " has " + count + "subsequence.");
    }  
}
