public class WordBreak {

    static class Node{
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean  search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow==true;
    }
    public static boolean wordBreak(String strr){
        if(strr.length()==0) return true;
        for(int i=1; i<=strr.length();i++){
            String strr1 = strr.substring(0, i);
            String strr2 = strr.substring(i);
            System.out.println(strr1+ " "+ strr2);
            if(search(strr1) && wordBreak(strr2)){
                return true;
            }
        }
return false;
    }

    public static void main(String[] args) {
        String[] words = {"i","like","mango"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        if(search("i")){
            System.out.println("yes!!");
        }else{
            System.out.println("not foundS");
        }
        String strr = "ilikemango";
        if(wordBreak(strr)){
            System.out.println("Do it correct ");
        }else{
            System.out.println("no word break!!!");
        }

    }
    
}
