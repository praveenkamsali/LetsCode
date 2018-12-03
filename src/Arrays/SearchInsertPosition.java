package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6,7,9,13,57};
        System.out.print(arrayResult(nums, 10));
    }

    private static int arrayResult(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target)
                return mid;
            else if(A[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
}