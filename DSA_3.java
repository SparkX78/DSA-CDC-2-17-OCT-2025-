import java.util.*;
public class DSA_3 {
    public static int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums = {10,20,30,40,50};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
