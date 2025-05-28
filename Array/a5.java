public class a5{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = array.length;
        int odd = 0;
        int even = 0;

        for(int i = 0; i < n; i++){
            if(array[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Odd : " + odd);
        System.out.println("Even : " + even);
    
    }
}