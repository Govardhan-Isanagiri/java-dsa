
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();
        int fact = 1;

        for(int i = 2; i<=num; i++){
            fact *=i;
        }

        System.out.println("Factorial of "+num+" is "+fact);
    }
}
