package Chatgpt.Forloop;

// Print numbers from 1 to 10, but stop the loop when you reach number 6.

public class Skip {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==7)break;
            System.out.println(i);
        }
        
    }
    
}
