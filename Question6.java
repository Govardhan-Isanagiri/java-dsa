import java.util.Scanner;

class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your salary:");
        float salary = sc.nextFloat();
        float tax = 0;

        if (salary >= 10) {
            tax = 0.3f;
            System.out.println("you need to pay " + (salary * tax) + " tax");
        } else if (salary >= 5 && salary < 10) {
            tax = 0.2f;
            System.out.println("you need to pay " + (salary * tax) + " tax");
        } else {
            System.out.println("you don't need to pay tax");
        }
    }
}