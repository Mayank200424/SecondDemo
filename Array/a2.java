public class a2{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int n = array.length;

        for(int i = n - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}