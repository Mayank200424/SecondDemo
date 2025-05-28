public class a3{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length;

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = sum + array[i];
        }

        System.out.println("Average : " + sum / n);
    }
}