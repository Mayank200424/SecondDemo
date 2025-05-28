public class a19{
    public static void main(String[] args) {
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,6};

        int[] num = new int[array1.length + array2.length];
        int c = 0,j = 0,k = 0;

        for(int i = 0; i < num.length; i++){
            if(c % 2 == 0){
                num[i] = array1[j];
                j++;
            }else{
                num[i] = array2[k];
                k++;
            }
            c++;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}