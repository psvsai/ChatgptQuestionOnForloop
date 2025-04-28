package Chatgpt.Forloop;

// Loop from 1 to 10, and for each number, print "Odd" if it’s odd, but skip printing if it's even using continue.

public class ContinueOdd {


    
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i%2==1)continue;{
                System.out.println("odd");
            }
            System.out.println(i);
        }
        
    }
    
}
