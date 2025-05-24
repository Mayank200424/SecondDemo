
public class p20{
    public static void main(String[] args) {
        
        int n = 12;

        int sum = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println("\n" + n + " is a perfect number");
        }else{
            System.out.println("\n" + n + " is not a perfect number");
        }

    }
}