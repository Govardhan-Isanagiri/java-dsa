
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter side of square");
        float side = sc.nextFloat();

        float area = side * side;

        System.out.println("Area of square with side " + side + " is " + area);
    }
}
