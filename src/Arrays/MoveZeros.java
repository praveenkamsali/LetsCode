package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */
/* Gives the length of n array after removing an element from a given array*/
/* Revisit this to pop out the element in the given array */
public class MoveZeros {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        int[] res = arrayResult(nums,0);
        for(int i = 0; i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    private static int[] arrayResult(int[] arr,int val) {
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }
        while ( j < arr.length){
            arr[j++] = 0;
        }
        return arr;
    }

}
