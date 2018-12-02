package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */
/* Gives the length of n array after removing an element from a given array*/
/* Revisit this to pop out the element in the given array */
public class RemoveElement {
    public static void main(String[] args){
        int[] nums = {2,3,4,5,8,8,7,4,8};
        System.out.print(arrayResult(nums,8));
    }

    private static int arrayResult(int[] arr,int val) {
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

}
