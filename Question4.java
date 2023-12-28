
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter cost of pencil");
        float pencil = sc.nextFloat();
        System.out.println("enter cost of pen");
        float pen = sc.nextFloat();
        System.out.println("enter cost of eariser");
        float eariser = sc.nextFloat();

        // taking 18% gst
        float sum = pencil + pen + eariser;
        float gst = sum * 0.18f;

        System.out.println("Total bill you need to pay with 18% gst is " + (sum + gst));
    }
}
