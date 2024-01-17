public class Question36 {
    public static void pattern(int rows){
        // outerloop - rows
        for(int i = rows; i>=1; i--){
            // innerloop - columns
            // numbers
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }

            // spaces
            // for(int j = 1; j<=rows-i; j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern(5);
    }
}
