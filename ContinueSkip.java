package Chatgpt.Forloop;

// Print all numbers from 1 to 20, but skip the numbers that are divisible by 3.

import java.util.Scanner;

public class ContinueSkip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value = ");
        int a = sc.nextInt();

        for (int i=1;i<=a;i++){
            if(i%3==0)continue;
            System.out.println(i);

        }
    }
    
}
