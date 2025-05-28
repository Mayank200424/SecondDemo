
public class a12 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;

        int[] num = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                num[j] = array[i];
                System.out.print(num[j] + " ");
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                num[j] = array[i];
                System.out.print(num[j] + " ");
                j++;
            }
        }
    }
}
