package HashTable;

import java.util.*;

/**
 * Created by praveenkamsali on 8/29/18.
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */
// TODO : Write a soultion for finding unique number  if other numbers are appearing more than once - any number of times
public class SingleNumber {
    public static void main(String[] args){
        int[] nums = new int[]{2,2,3,4,4};
        System.out.println("The Single Number is : "+singleNumberLogic(nums));
    }

    private static int singleNumberLogic(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            if (!set.add(i)) {
                set.remove(i);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}
