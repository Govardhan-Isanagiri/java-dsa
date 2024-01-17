
import java.util.Scanner;

public class Question24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int assic = 64;
        // no.of lines
        for(int i = 1; i<=n; i++){
            // no.of alphabets in each line
            for(int j = 1; j<=i; j++){
                assic++;
                System.out.print((char)assic+" ");
            }
            System.out.println();
        }
    }
}
