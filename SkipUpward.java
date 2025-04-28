package Chatgpt.Forloop;

// Keep adding numbers from 1 upwards until the sum becomes more than 50.
//  Use break to exit once the condition is met.

public class SkipUpward {
    public static void main(String[] args) {
        int b = 0;
        for(int i=1;i<=100;i++){
            b= b+i;
            if(b > 50){
                break;
            }
        }
        System.out.println(b);
        
    }
    
}
