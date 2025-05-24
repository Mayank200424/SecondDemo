public class p5{
    public static void main(String[] args) {
        
        // Odd Number

        for(int i = 1; i <= 10; i++){
            if(i % 2 != 0){
                System.out.println("Odd Number : " + i);
            }
        }

        // Even Number 
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println("Even Number : " + i);
            }
        }
    }
}