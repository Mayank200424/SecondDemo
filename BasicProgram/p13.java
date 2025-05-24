public class p13{
    public static void main(String[] args) {
        int n = 4421;
        int POD = 1;
        int SOD = 0;
        int r;

        while(n > 0){
            r = n % 10;
            POD = POD * r;
            SOD = SOD + r;
            n = n / 10;
        }

        System.out.println("POD : " + POD);
        System.out.println("SOD : " + SOD);
        System.out.println("Result : " + (POD - SOD));
    }
}