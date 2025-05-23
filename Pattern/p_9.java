public class p_9{
    public static void main(String[] args) {
        int n = 5;

        // for(int i = 1; i <=n; i++){
        //     for(int j = 1; j <= i; j++){
        //         if(i == 1){
        //             for(int k = 1; k <= n; k++){
        //                 System.out.print(" ");
        //             }
        //             System.out.print(i);
        //         }else{
        //             System.out.print(i);
        //         }
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}