public class Question37{
    public static void pattern(int rows){
        int counter = 1;
        // outerloop - rows
        for(int i = 1; i<=rows; i++){
            // innerloop - colus
            // numbers
            for(int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }

            // spaces
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern(5);
    }
}