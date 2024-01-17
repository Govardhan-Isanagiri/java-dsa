import java.util.Scanner;
public class Question26 {
    public static boolean primeChecker(int n){
        for(int i = 2 ; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primes(int n){
        for(int i = 2; i<=n; i++){
            if(primeChecker(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to print primes upto that");
        int num = sc.nextInt();
        primes(num);
    }
}
