
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int num = sc.nextInt();

        System.out.println("Sum of "+num+" natural numbers is "+(num*(num+1)/2));

        // using while loop
        int sum = 0;
        int i = 1;
        while(i<=num){
            sum += i;
            i++;
        }
        System.out.println("Sum of "+num+" natural number is "+sum);
    }
}
