public class a21{
    public static void main(String args[]){
        int[] array = {0,1,1,0,1,0,0,1};
        int n = array.length;

        int start = 0,end = n - 1;
        int temp = 0;

        while(start <= end){
            if(array[start] == 1){
                start++;
            }else if(array[end] == 0){
                end--;
            }else{
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        for(int i = 0;i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}