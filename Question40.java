public class Question40 {
    public static void pattern(int rows, int cols){
        for(int i = 1; i<=rows; i++){
            // spaces
            for(int j = 1; j<=cols-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=cols; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<=(i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(5, 5);
    }
}
