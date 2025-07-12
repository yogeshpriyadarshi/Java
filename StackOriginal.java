
import java.util.Stack;

public class StackOriginal {
   static Stack<Integer> s = new Stack<>();

    public static void pushAtBottom( int data){
        if(s.size()==0){
            s.push(data);
            return;
        }
        int value = s.pop();
        pushAtBottom(data);
        s.push(value);

    }

    public static void main(){
    
        s.push(10);
        s.push(15);
        s.push(12);
        s.push(25);
        pushAtBottom(33);

    while(s.size()>0){
        System.out.println(s.peek());
        s.pop();
    }
    } 
}
