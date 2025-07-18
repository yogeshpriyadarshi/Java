// implementation of stack by using linkedList.

public class StackLinkedList {
    static class Node{
        int data;
        Node next;

         Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }

        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(){
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(2);
        s.push(9);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek() + "   hello!  ");
            s.pop();
        }


    }
    
}
