
import java.util.Scanner;

public class Question31 {
    public static int greatest(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1:");
        int num1 = sc.nextInt();
        System.out.println("enter num2:");
        int num2 = sc.nextInt();
        System.out.println("enter num3:");
        int num3 = sc.nextInt();

        int greater = greatest(num1, num2, num3);

        System.out.println(greater +  " greater among "+num1+", "+num2+" and "+num3);
    }
}
