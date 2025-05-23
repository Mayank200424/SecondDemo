
import java.util.Scanner;

public class p9{
    public static void main(String[] args) {
        // int n = 125;
        // int m = n;

        // int r , rev = 0;

        // while(n > 0){
        //     r = n % 10;
        //     rev = (rev * 10) + r;
        //     n = n / 10;
        // }

        // if(rev == m){
        //     System.out.println("The number is a palindrome");
        // }else{
        //     System.out.println("The number is not a palindrome");
        // }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 :");
        int n1 = sc.nextInt();

        System.out.print("Enter Number 2 :");
        int n2 =sc.nextInt();

        int a=1;
        for(int i=1; i<=n2; i++){
            a = a * n1;
        }
        System.out.println(a);
    }
}