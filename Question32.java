import java.util.Scanner;

public class Question32 {
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int rev = 0;

        while(num>0){
            int lastDigit = num%10;
            rev = rev * 10 +lastDigit;
            num/=10;
        }

        if(rev == originalNum){
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num:");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num+" is a palindrome");
        }else{
            System.out.println(num+" is not palindrome");
        }
    }
}
