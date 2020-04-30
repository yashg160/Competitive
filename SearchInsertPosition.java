
public class SearchInsertPosition {
    public static void main(String[] args) {
        /*
         * 
         * Given a sorted array and a target value, return the index if the target is
         * found. If not, return the index where it would be if it were inserted in
         * order.
         * 
         * You may assume no duplicates in the array.
         * 
         */

        int[] nums = new int[] { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target)
                return i;

        int position = nums.length;
        if (target < nums[0])
            position = 0;

        else {
            for (int i = 0; i < nums.length - 1; i++)
                if (nums[i] <= target && nums[i + 1] >= target)
                    position = i + 1;
        }

        return position;
    }
}