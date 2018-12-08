package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */
/* Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array. */

public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
       // int[] nums = {1,2};
        int rotate = 3;
        rotate = rotate % nums.length;
        reverse(nums,0,nums.length-1 - rotate);
         reverse(nums,nums.length - rotate,nums.length-1);
         reverse(nums,0,nums.length -1);

        for(int i = 0; i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    private static int[] reverse(int[] num,int start, int end) {

        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        return num;
    }

}
