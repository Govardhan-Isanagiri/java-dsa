import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter num1");
        int num1 = sc.nextInt();
        System.out.println("Please enter num2");
        int num2 = sc.nextInt();
        System.out.println("please enter num3");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is " + (sum / 3));
    }
}
