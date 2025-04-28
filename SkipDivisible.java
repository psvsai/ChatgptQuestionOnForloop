package Chatgpt.Forloop;

// Find the first number divisible by both 3 and 5 between 1 and 100, and break the loop once found.

public class SkipDivisible {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0)break;
            System.out.println(i);
        }
    }
}
