import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your body temperature");
        float temperature = sc.nextFloat();

        String feverCheck = temperature > 100 ? "Fever" : "don't have fever";

        System.out.println(feverCheck);
    }
}
