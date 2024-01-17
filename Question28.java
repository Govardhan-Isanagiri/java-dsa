import java.util.Scanner;

public class Question28 {
    public static void binaryConverter(int num){
        int pow = 0, binary = 0;

        while(num > 0){
            binary += (num%2)*Math.pow(10, pow);
            num /= 2;
            pow++;
        }
        System.out.println(binary);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter decimal number:");
        int num = sc.nextInt();

        binaryConverter(num);
    }
}
