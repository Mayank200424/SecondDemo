
public class p10 {

    public static void main(String[] args) {


        // Continue (Skip)
        System.out.println("Continue : ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // Break (Exit)
        System.out.println("Break : ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // Return (Exit)
        System.out.println("Return : ");
        for (int i = 1; i <= 10; i++){
            if( i == 5){
                return;
            }
            System.out.println(i);
        }
    }
}
