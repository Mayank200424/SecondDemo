public class a16{
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,5,5,6};
        int n = array.length;
        int d = 1;

        int count = 0;

        for(int i = 0; i < n; i++){
            if(array[i] == d){
                count++;
            }
        }

        if(count > 1){
            System.out.println("Number is a Duplicate");
        }else{
            System.out.println("Number is not a Duplicate");
        }

    }
}