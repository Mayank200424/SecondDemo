public class p_8{
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i <= n; i++) {
             for(int k = i; k <= n - 1; k++){
                System.out.print(" ");
            }
            // Descending part
            for (int j = i; j >= 0; j--) {
                System.out.print(j + "");
            }

            // Ascending part (start from 1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }

            // Move to the next line
            System.out.println();
        }
        
    }
}