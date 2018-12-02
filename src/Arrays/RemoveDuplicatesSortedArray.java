package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.print(arrayResult(nums));
    }

     private static int arrayResult(int[] nums) {
         int j = nums.length > 0 ? 1 : 0 ;
         for(int i = 0; i <nums.length;i++){
             if((nums[i] > nums[j-1])){
                 nums[j] = nums[i];
                 j++;
             }
         }
         return j;
     }
}
