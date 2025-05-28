public class a4{
    public static void main(String[] args) {
        int[] array = {10,20,15,30,35,45,50,40};
        int n = array.length;
        int num = 55;
        boolean found = false;

        for(int i = 0; i < n; i++){
            if(array[i] == num){
                found = true;
            }
        }

        if(found == true){
            System.out.print("Element is present");
        }else{
            System.out.print("Element is not present");
        }
    }
}