public class Question41 {
    public static void pattern(int n){
        for(int i = 1; i<=n; i++){
            // spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=n; j++){
                if(j == 1 || j == n || i == 1 || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // spaces
            for(int j = 1; j<=(i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(7);
    }
}
