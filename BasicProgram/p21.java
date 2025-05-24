public class p21{
    public static void main(String[] args) {
        int start = 1;
        int end = 50;

        for(int i = start; i <= end; i++){
            int sum = 0;

            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    sum = sum + j;
                }
            }
            if(sum == i){
                System.out.print(i + " ");
            }
        }
    }
}