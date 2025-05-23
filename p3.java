public class p3{
    public static void main(String[] args) {
        System.out.println("Reverse For Loop : ");

        for(int i = 10; i >= 1; i--){
            System.out.println("Value of i is : " + i);
        }

        System.out.println("While Loop : ");

        int i = 10;

        while(i >= 1){
            System.out.println("Value of i is : " + i);
            i--;
        }

        System.out.println("Do While Loop : ");
        int a = 10;

        do{
            System.out.println("Value of a is : " + a);
            a--;
        }while(a >= 1);

    }
}