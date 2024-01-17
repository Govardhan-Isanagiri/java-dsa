
import java.util.Scanner;
public class Question19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2 ; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                isPrime = false;
                System.out.println(num+" is not a prime number");
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        }
    }
}
