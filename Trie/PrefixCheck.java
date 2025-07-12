public class PrefixCheck {

    static class Node{
        Node[] children;
        boolean eow;

        public Node() {
            children= new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow = true;
        }        
    }

 static Node root = new Node();

   static void insertion(String word){
    Node curr = root;
    for(int i=0; i<word.length(); i++){
        int idx = word.charAt(i) -'a';
        if(curr.children[idx]==null){
            curr.children[idx]= new Node();
        }
        curr=curr.children[idx];
    }
    curr.eow = true;
    }

    static boolean  prefix(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
           int idx= word.charAt(i) - 'a';
           if(curr.children[idx]==null){
            return false;
           }
           curr = curr.children[idx];
            }
        return true;  
    }


    public static void main(String[] args){
        String[] words = {"ram", "world", "hero", "great"};
        for(int i=0; i<words.length; i++){
            insertion(words[i]);
        }
        String strr = "her";
        if(prefix(strr)){
            System.out.println(" yes, " + strr+ " is prefix !!!!");
        }else{
            System.out.println(" No, "+ strr +"  is not prefix");
        }
    }   
}
