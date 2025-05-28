public class a7{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int n = array.length;

        System.out.println("Alternate Element : " );
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}