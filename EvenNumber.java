package Chatgpt.Forloop;

import java.util.Scanner;

// Print all even numbers between 1 to 20.

public class EvenNumber {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        for(int i= 1 ; i<=b; i++){
            if (i%2==0){
            System.out.println("Print loop =  " + i );
            }
        }

    }
    

}
