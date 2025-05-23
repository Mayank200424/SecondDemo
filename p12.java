public class p12{
    public static void main(String[] args) {
        int n = 5;
        int m = 6;

        int num1 = 0;
        int num2 = 0;

        for(int i = 1; i <= n; i++){
            if(i % m == 0){
                num1 = num1 + i;
            }else{
                num2 = num2 + i;
            }
        }
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);

        System.out.println("Result : " + (num2 - num1));
    }
}