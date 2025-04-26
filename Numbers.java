package Chatgpt.Forloop;

import java.util.Scanner;

// Print numbers from 1 to 10 using a for loop`.

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1; i<=a ; i++){
            System.out.println(i);
        }
    }
}
