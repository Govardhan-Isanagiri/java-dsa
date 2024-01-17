public class Question39 {
    public static void pattern(int n){
        // upper part
        for(int i = 1; i<=n; i++){
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for(int i = n; i>=1; i--){
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<=2*(n-i); j++){
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
        pattern(5);
    }
}
