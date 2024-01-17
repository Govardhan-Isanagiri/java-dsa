import java.util.Scanner;

public class Question27{
    public static int decimalConverter(int num){
        // formula: sum + lastdigit * 2 power of pow;
        int power = 0;
        int sum = 0;
        while(num > 0){
            sum += (num%10)*Math.pow(2, power);
            power++;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number:");
        int num = sc.nextInt();
        int decimal = decimalConverter(num);
        System.out.println(num+" decimal form is "+decimal);
    }
}