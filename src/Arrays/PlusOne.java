package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */
/* Gives the length of n array after removing an element from a given array*/
/* Adds 1 to the last index value keeping the array elements less than 10*/
public class PlusOne {
    public static void main(String[] args){
        int[] nums = {9,9,9,9};
        int[] res = arrayResult(nums);
        for(int i = 0; i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    private static int[] arrayResult(int[] digits) {
        for (int i = digits.length-1; i>= 0; i--) {
            digits[i] += 1;
            if (digits[i] <= 9) {
                return digits;
            }
            digits[i] = 0;
        }
        //if it wont gets returned until now then create a new array and have the first index value as 1.
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }

}
