public class a9{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int n = array.length;

        for(int i = 0; i < n; i++){
            if(array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
         for(int i = 0; i < n; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}