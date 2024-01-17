import java.util.Scanner;

public class Question33 {
    public static int digitsSum(int num){
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        int num = sc.nextInt();

        int sum = digitsSum(num);

        System.out.println("Sum of digits in "+num+" is "+sum);
    }
}


