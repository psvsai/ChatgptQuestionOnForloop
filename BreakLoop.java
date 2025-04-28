package Chatgpt.Forloop;

// Stop the loop if the number is greater than 15 (use break)

import java.util.Scanner;

public class BreakLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =1; i<=a ; i++){
            if(i>15)break;
            System.out.println(i);
        }
    }
    
}
