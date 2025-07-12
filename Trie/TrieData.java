public class TrieData {

    static class Node{
        Node[] children = new Node[26];  //This children is initialized by null by default
        boolean eow;   //This eow is null by default
    }

    static Node root = new Node();

    public static void insertion(String word){
        Node curr = root;
        int n = word.length();
        for(int i=0; i<n; i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                // create new Node
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
     }

    public static boolean search(String word){
        Node curr = root;
        int n = word.length();
        for(int i=0; i<n; i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow==true;
     }

    public static void main(String args[]){

        String words[] = {"ram","krishana","sita","abcde"};
        for (int i =0; i<words.length; i++){
        insertion(words[i]);
        }
        String str= "rama";
        if(search(str)){
            System.out.println(str +" word exist in trie!!!");
        }else{
            System.out.println(str+" word does not exist!!!");
        }
    }
    
}
