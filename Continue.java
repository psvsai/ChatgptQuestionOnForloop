package Chatgpt.Forloop;

// Print numbers from 1 to 10, but skip the number 5.

public class Continue {
     public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5)continue;
            System.out.println(i);
        }
     }
    
}
