package String;

import java.util.Scanner;

public class Strr {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words are you entering:  ");
        int number = sc.nextInt();
        String[] strr = new String[number];
        int totalLength=0;
        for(int i=0; i<strr.length;i++){
            System.out.println("Enter " + (i+1) + " word here::");
            strr[i]= sc.next();
            int n= strr[i].length();
            totalLength += n;
        }

        System.out.println("cummulative length is " + totalLength);
}
}
