public class ReverseString {
    public static String revString(String str){

        if(str.length()==1){
            return str;
        }

    char currstr = str.charAt(0);
        String rev = revString(str.substring(1));
        return rev + currstr;

    }
    public static void main(){
        String str = "Hello";

        String revString = revString(str);

        System.out.println("  reverse string of " +str + " is " +revString);
    }
    
}
