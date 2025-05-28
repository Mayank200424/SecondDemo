public class a17{
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,4,5,5,6};
        int n = array.length;
        int c = 0;
        int d = 2;

        for(int i = 0; i < n; i++){
            if(array[i] == d){
                c++;
            }
        }

        if(c == 1){
            System.out.println("Number is a Unique");
        }else{
            System.out.println("Number is not Unique");
        }

    }
}