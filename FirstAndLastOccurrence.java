public class FirstAndLastOccurrence {
    public static int first = -1;
    public static int last = -1;

    public static void checkOccurrence( String str, char en, int idx){
        if(idx == str.length()){
            return;
        }

        if(en==str.charAt(idx)){
            if(first==-1){
                first = idx;
                last = idx; 
            }else{
                last = idx;
            }
        }
          idx++;
        checkOccurrence(str, en, idx);
    }



    public static void main(String[] args) {
        String str = "monotonous";
        char en = 'o';

        checkOccurrence(str,en,0);

        System.out.println("first occurrence of " + en + " at "+ first);
        System.out.println("last occurrence of " + en + " at " + last);

        

    }
    
}
