package Chatgpt.Forloop;

import java.util.Scanner;

public class Mutiltiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value = " );
        int x = sc.nextInt();

        for(int i=1; i<=10 ; i++){
            System.out.println(x + "*" + i + "=" + i*x );
            
        }
    }
    
}
