package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */

//Bad Solution
public class RotateArraySol2 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int rotate = 3;
        rotate = rotate % nums.length;
        reverse(nums,rotate);

        for(int i = 0; i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    private static void reverse(int[] nums,int k) {

        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }


}
