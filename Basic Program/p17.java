public class p17{
    public static void main(String[] args) {
        int n = 10101;

        int r;
        while (n > 0){
            r = n % 10;
            if (r > 1){
                System.out.println(false);
                return;
            }
            n = n / 10;
        }
        System.out.println(true);
    }
}