public class Question35 {
    public static void pattern(int rows){
        // outerloop - rows
        for(int i = 1; i<=rows; i++){
            // innerloop - col
            // spaces
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern(10);
    }
}
