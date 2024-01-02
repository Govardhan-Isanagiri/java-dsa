import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();

        String numPosOrNeg = num > 0 ? "Positive" : "Negative";

        System.out.println(num + " is " + numPosOrNeg);
    }
}
