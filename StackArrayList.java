
import java.util.ArrayList;

public class StackArrayList {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
             if(list.size()==0){
              return true;
            }else{
                return false;
            }
        }

        public static void  push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()) return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();   
        s.push(25);
        s.push(32);
        s.push(11);
        s.push(24);
        s.push(04);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        } 
    }
    
}
