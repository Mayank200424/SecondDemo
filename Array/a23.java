public class a23{
    public static void main(String[] args) {
        int[] array = {1, 4, 8, 9, 10, 20, 18, 15,22};
        int n = array.length;

        int FirstMax = 0;
        int SecondMax = 0;
        int ThirdMax = 0;

        for(int i = 0; i < n; i++){
            if(array[i] > FirstMax){
                ThirdMax = SecondMax;
                SecondMax = FirstMax;
                FirstMax = array[i];
            }else if(array[i] > SecondMax){
                ThirdMax = SecondMax;
                SecondMax = array[i];
            }else if(array[i] > ThirdMax){
                ThirdMax = array[i];
            }
        }
        System.out.println("First Max: " + FirstMax);
        System.out.println("Second Max: " + SecondMax);
        System.out.println("Third Max: " + ThirdMax);

    }
}