
import java.util.Scanner;

public class Question34 {
    public static void pattern(int rows, int col){
        // outerloop - rows 
        for(int i = 1; i<=rows; i++){
            // innerloop -colums ---> (i,j)
            for(int j = 1; j<=col; j++){
                if(i == 1 || i == rows || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no.of rows:");
        int m = sc.nextInt();
        System.out.println("enter no.of col:");
        int n = sc.nextInt();

        pattern(m, n);
    }
}
