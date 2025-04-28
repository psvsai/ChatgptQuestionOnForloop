package Chatgpt.Forloop;
// Skip if the number is divisible by 4 (use continue)
import java.util.Scanner;

public class SKipDIvisible2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1;i<=a;i++){
            if(i%4==0)continue;
            System.out.println(i);
        }
    }
    
}
