public class a10{
    public static void main(String[] args) {
        int[] array = {10,15,20,5,100,35,25,40,45,55,50};

        int n = array.length;

        int max = 0;

        for(int i = 0; i < n; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Maximum Element : " + max);
    }
}