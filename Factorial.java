package Chatgpt.Forloop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 1;

        for(int i=a;i>=1;i--){
           b = b*i;
        }

    System.out.println( "Factorail of " + a + " = "+ b);
    }
    
}
