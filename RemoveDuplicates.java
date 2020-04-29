package Repository;

public class RemoveDuplicates {
    public static void main(String[] args) {
        /*
        
        Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
        See more examples at: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
        */

        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

    }

    public static int removeDuplicates(int[] nums){
        int startIdx = 0;
        int idx = 0;
        int n = nums.length;
        while(idx < n-1){
            if(nums[idx+1] - nums[idx] > 0){
                nums[startIdx+1] = nums[idx+1];
                startIdx +=1 ;
            }
            idx += 1;
            System.out.println(startIdx + "   " + idx);
        }
        
        return startIdx+1;
    }
}