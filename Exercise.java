
import java.util.Scanner;



public class Exercise {
    public static void greaterNumber(int a, int b){
        if(a>b){
            System.out.println(a+ " is greater than " + b);
        }else if(a==b){
            System.out.println("Both number are equal!");
        }else{
        System.out.println(b + " is greater than " + a);

        }
    }

 

    public static void main(){
       
     Scanner sc = new Scanner((System.in));
      System.out.println("Enter first number:");
      int x= sc.nextInt();
         System.out.println("Enter second number:");
      int y = sc.nextInt();
      greaterNumber(x,y);



        sc.close();
    }
    
}
