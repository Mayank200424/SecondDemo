public class a14{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;

        int start = 0,end = n - 1;
        int temp = 0;

        while(start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}