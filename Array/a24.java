public class a24{
    public static void main(String[] args) {
        int[] array = {1,2,9,15,27,30};

        int sum = 35;
        int n = array.length;
        int start = 0,end = n - 1;

        while (start <= end){
            if(array[start] + array[end] == sum){
                System.out.print("Present");
                return;
            }else if(array[start] + array[end] < sum){
                start++;
            }else{
                end--;
            }
        }
        System.out.print("Not Present");

    }
}