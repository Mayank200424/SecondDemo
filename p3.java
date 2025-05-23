public class p3{
    public static void main(String[] args) {
        System.out.println("For Loop : ");

        for(int i = 1; i <= 10; i++){
            System.out.println("Value of i is : " + i);
        }

        System.out.println("While Loop : ");

        int i = 1;

        while(i <= 10){
            System.out.println("Value of i is : " + i);
            i++;
        }

        System.out.println("Do While Loop : ");
        int a = 1;

        do{
            System.out.println("Value of a is : " + a);
            a++;
        }while(a <= 10);

    }
}