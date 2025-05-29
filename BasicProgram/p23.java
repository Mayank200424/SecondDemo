import java.util.ArrayList;
import java.util.Collections;

public class p23 {

    public static void main(String[] args) {
        int n = 358;
        int m = n;
        ArrayList<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }
        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        boolean isIncrementing = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                isIncrementing = false;
                break;
            }
        }

        if (isIncrementing) {
            System.out.println(m + " is an incrementing number.");
        } else {
            System.out.println(m + " is NOT an incrementing number.");
        }
    }
}
