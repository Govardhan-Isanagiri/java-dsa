
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter number: ");
            int num = sc.nextInt();
            if(num%10 == 0){
                System.out.println("enter multiple of 10, so you are exited");
                break;
            }
            System.out.println(num);
        }while(true);
    }
}
