
import java.util.Scanner;

public class p6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number A : ");
        int A = sc.nextInt();

        System.out.println("Enter Number B : ");
        int B = sc.nextInt();

        System.out.println("Enter Number C : ");
        int C = sc.nextInt();

        if (A > B && A > C){
            System.out.println("A is Big");
        }else if(B > A && B > C){
            System.out.println("B is Big");
        }else if(C > A && C > B){
            System.out.println("C is Big");
        }else if(A == B && A > C){
            System.out.println("A and B is Big");
        }else if(B == C && B > A){
            System.out.println("B and C is Big");
        }else if(A == C && C > B){
            System.out.println("A and C is Big");
        }else{
            System.out.println("All are Equal");
        }
    }
}