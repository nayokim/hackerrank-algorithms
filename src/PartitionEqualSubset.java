import java.util.ArrayList;
import java.util.List;

public class PartitionEqualSubset {

    //Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
    //Input: [1, 5, 11, 5]
    //
    //Output: true
    //
    //Explanation: The array can be partitioned as [1, 5, 5] and [11].

    public boolean canPartition(int[] nums) {

            /*
            arr = [1,5,11,5]
          - total sum = subsetsum * 2
          - in this case:
          22 = 2x
          x = 11;



        Input: [1, 2, 3, 5]
        11 =  2x
        return false;


        - total sum needs to be even
        1. get total sum
        2. sort the array
        3. add to buckets if the number is <= target or the bucket sum != target

         */

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        return true;
    }

    public boolean findSum(int[] nums, int targetSum) {
        int [][] dp = new int [nums.length][targetSum + 1];
        for (int i = 0; i < nums.length; i++){
            dp[i][0]= 1;
        }
        for(int j = 0; j <= targetSum; j++){
            if(nums[0] == j)
                dp[0][j] = 1;
        }

        for(int i = 1; i < nums.length; i++){
            for(int j = 1; j <= targetSum; j++ ){
                int excludeNewValue = 0;
                int includeNewValue = 0;
                excludeNewValue = dp[i-1][j];
                if(nums[i]>j)
                    includeNewValue = 0;
                else
                    includeNewValue = dp[i-1][j-nums[i]];
                dp[i][j] = includeNewValue + excludeNewValue;
                if (dp[i][targetSum] > 0) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};


    }

}


//

