import java.util.Scanner;

public class Question16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num:");
        int num = sc.nextInt();
        
        while(num>0){
            System.out.print(num%10);
            num /= 10;
        }
        System.out.println();
    }
}
