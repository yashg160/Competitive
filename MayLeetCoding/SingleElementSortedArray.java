public class SingleElementSortedArray {
    public static int findSingleElement(int[] nums) {
        int number = nums[0];
        int count = 1;
        int ans = -1;

        for (int i = 1; i < nums.length - 1; i++) {
            int num = nums[i];
            if (num != number) {
                if (count == 1) {
                    ans = nums[i - 1];
                    break;
                } else {
                    count = 1;
                    number = num;
                }
            } else {
                count++;
            }

        }

        if (ans == -1)
            return nums[nums.length - 1];
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 3, 7, 7, 10, 11, 11 };

        System.out.println(findSingleElement(nums));
    }
}