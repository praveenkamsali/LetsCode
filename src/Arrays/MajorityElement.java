package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */
/* Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array. */

/**
 * Boyer-Moore algorithm **/

public class MajorityElement {
    public static void main(String[] args){
        int[] nums = {3,2,3,2,2};
        System.out.print(arrayResult(nums));
    }

    private static int arrayResult(int[] num) {
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

}
