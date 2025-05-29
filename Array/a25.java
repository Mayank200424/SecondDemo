public class a25{
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        int n = nums.length;

        boolean flag;

        for(int i = 0; i < n; i++){
            flag = true;
            for(int j = 0; j < n; j++){
                if(nums[j] == nums[i] && i != j){  
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Unique number is: " + nums[i]);
                break;
            }
        }
        
    }
}