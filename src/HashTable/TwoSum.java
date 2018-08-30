package HashTable;

import java.util.Hashtable;

/**
 * Created by praveenkamsali on 8/29/18.
 */
public class TwoSum {

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5};
        int[] result = twoSumLogic(nums,1);
        for(int i=0;i<result.length;i++) {
            System.out.println("The Target Values are : " + result[i]);
        }
    }

    private static int[] twoSumLogic(int[] nums,int target) {
        Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
        for(int i =0;i<=nums.length;i++){
          int complement = target - nums[i];
            if(table.containsKey(complement)){
                return new int[]{i,table.get(complement)};
            }
            table.put(nums[i],i);
        }

        throw new IllegalArgumentException("Match not Found");
    }
}
