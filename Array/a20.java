
public class a20 {
    public static void main(String[] args) {
        int[] a = {12, 33, 44, 33, 22};
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = 0; j < n; j++) {
                if (a[i] > a[j]) {
                    c++;
                }
            }
            System.out.print(c + " ");
        }
    }
}
