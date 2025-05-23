public class p8{
    public static void main(String[] args) {

        // Reverse Number 
        
        int n = 123;

        int r;
        int rev = 0;

        while(n > 0){
            r = n % 10;
            rev  = (rev * 10) + r;
            n = n / 10;
        }

        System.out.println("Reverse Number : " + rev);


        // Count Number
        // int n = 123890;

        // int r,c = 0;
        // int rev = 0;

        // while(n > 0){
        //     r = n % 10;
        //     c++;
        //     n = n / 10;
        // }

        // System.out.println("Count Number : " + c);
    }
}