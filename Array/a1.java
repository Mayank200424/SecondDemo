public class a1{
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int sum = 0;
        int n = array.length;

        for(int i = 0; i < n; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}