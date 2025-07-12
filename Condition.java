
import java.util.Scanner;

public class Condition {
    public static void main(){
        System.out.println("");
        Scanner sc = new Scanner((System.in));
        System.out.print("enter your button! :");
        int button = sc.nextInt();



    //     if(x==y){
    //         System.out.println(" Both number are equal!");
    //     }else if(x>y) {
    //         System.out.println("  first number is greater than second number!");
    //     }else{
    //         System.out.println("second is greater than first number!");
    //     }
     switch(button){
        case 1: System.out.println("Hello!");
        break;
        case 2: System.out.println("Namaste!");
        break;
        case 3: System.out.println("Good Morning!");
        break;
        default: System.out.println("Invalid button!");
     }


        sc.close();
     }
    
}
