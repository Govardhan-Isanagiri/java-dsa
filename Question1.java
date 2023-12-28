
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter num1");
        int num1 = sc.nextInt();
        System.out.println("Please enter num2");
        int num2 = sc.nextInt();
        System.out.println("Please enter num3");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("greatest among " + num1 + ", " + num2 + " and " + num3 + " is " + num1);
            } else if (num2 > num3) {
                System.out.println("greatest among " + num1 + ", " + num2 + ", " + num3 + " is " + num2);
            } else {
                System.out.println("greatest among " + num1 + ", " + num2 + " and " + num3 + " is " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("greatest among " + num1 + ", " + num2 + ", " + num3 + " is " + num2);
        } else {
            System.out.println("greatest among " + num1 + ", " + num2 + " and " + num3 + " is " + num3);
        }
    }
}