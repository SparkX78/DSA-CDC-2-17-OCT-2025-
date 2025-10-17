import java.util.*;
public class DSA_5 {
    
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(0, n-1, nums);
        reverse(0, k-1, nums);
        reverse(k, n-1, nums);
    }
    private static void reverse(int start, int end, int[] nums){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int[] nums = {10,20,30,40,50};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }
}

