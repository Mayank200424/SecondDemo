
public class a18 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 6, 7, 8, 5};

        int n = array1.length;
        int m = array2.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("Common element: " + array1[i]);
                }
            }
        }
    }
}
