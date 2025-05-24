public class p18{
    public static void main(String[] args) {
        int n = 8972;
        int sum = 0;
        int c = 0;

        while(n > 0){
            int r = n % 10;
            sum = sum + r;
            c++;
            n = n / 10;
        }
        System.out.println("Result :" + (sum / c));

        
    }
}