import java.util.Scanner;

public class Question21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("enter a number: ");
            number = sc.nextInt();
            if(number % 2 == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.println("enter 1 for continue, 0 for exit");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Total even sum is "+evenSum);
        System.out.println("Total odd sum is "+oddSum);
    }
}
