
import java.util.Scanner;

public class p4{
    public static void main(String[] args) {
        System.out.println("Multiplcation Table ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println( n + " X " + i + " = " + i * n );
        }
    }
}