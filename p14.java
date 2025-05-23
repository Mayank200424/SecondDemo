public class p14{
    public static void main(String[] args) {
        int n = 18;
        int c = 0;

        while(n > 0 ){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = n - 1;
            }
            c++;
        }
        System.out.println(c);
    }
}