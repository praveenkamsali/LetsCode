package Arrays;

/**
 * Created by praveenkamsali on 12/2/18.
 */

public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1,0,1,1};
        System.out.print(arrayResult(nums));
    }

    private static int arrayResult(int[] num) {
        int result = 0, count = 0;
        for(int i=0; i < num.length;i++){
            if(num[i]==1){
                count++;
                result= count > result ? count : result;
            } else
                count = 0;
}
        return result;
    }

}
