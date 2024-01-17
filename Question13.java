public class Question13 {
    public static void main(String[] args){

        // Hallow full pyramid with stars

        // for(int i = 1; i<=5; i++){
        //     // whitespaces
        //     for(int j = 1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }

        //     // stars
        //     for(int j = 1; j<=i; j++){
        //         if(j == 1 || j == i || i == 5){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Hallow pyramid with numbers
        for(int i = 1; i<=5; i++){
            // spaces
            for(int j = 1; j<=5-i; j++){
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j<=i; j++){
                if(j == 1 || j == i || i == 5){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
