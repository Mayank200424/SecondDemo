public class a8{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6};

        int n = array.length;

        for(int i = n - 1; i >= 0; i--){
            if(i % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}