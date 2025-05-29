public class a22{
    public static void main(String[] args) {
        int[] array = {2,8,3,4,6,5,7,1};
        int n = array.length;

        int start = 0,end = n - 1;
        int temp = 0;

        while(start <= end){
            if(array[start] % 2 != 0){
                start++;
            }else if(array[end] % 2 == 0){
                end--;
            }else{
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }

        for (int i =0 ; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}