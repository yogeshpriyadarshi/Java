public class MoveAllxToEnd {
    public static String result = "";
    public static String onlyx = " ";

    public static void move(String str, int idx){
        if(idx == str.length()){
            result = result + onlyx;           
             return;
        }

        if(str.charAt(idx)=='x'){
             onlyx = onlyx + 'x';
        }else{
              result = result + str.charAt(idx);
        }
        move(str, idx+1);

    }
    public static void main(String[] args) {
        String strr = "rxamxxdoxxxit";
        
        move(strr,0);

        System.out.println(result);;

    }
    
}
