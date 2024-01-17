
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter number: ");
            int num = sc.nextInt();
            if(num%10 == 0){
                continue;
            }
            System.out.println(num);
        }while(true);
    }
}
