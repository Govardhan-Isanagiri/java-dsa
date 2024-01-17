import java.util.Scanner;

public class Question25 {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 2; i<=n; i++){
            fact *=i;
        }
        return fact;
    }

    public static double binomialCoefficient(int n, int r){
        double factNum = factorial(n);
        double factRad = factorial(r);
        int factNmR = factorial(n - r);
        double binomial = factNum/(factRad*factNmR);
        return binomial;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number:");
        int num = sc.nextInt();
        System.out.println("enter radius:");
        int radius = sc.nextInt();

        System.out.println(binomialCoefficient(num, radius));
    }
}
