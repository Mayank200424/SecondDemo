public class a11{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
         int n = array.length;

        int[] num = new int[n]; 
        int j = 0;

        for(int i = 0; i < n; i++){
            num[j] = array[i];
            j++;
        }

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }

        
    }
}