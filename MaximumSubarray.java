class MaximumSubarray {

    public static int conquer(int[] nums, int low, int mid, int high) {
        Integer leftSum = Integer.MIN_VALUE;
        Integer rightSum = Integer.MIN_VALUE;

        int tempLeft = 0;
        for (int i = mid; i >= low; i--) {
            tempLeft += nums[i];
            if (tempLeft > leftSum)
                leftSum = tempLeft;
        }

        int tempRight = 0;
        for (int i = mid + 1; i <= high; i++) {
            tempRight += nums[i];
            if (tempRight > rightSum)
                rightSum = tempRight;
        }

        return leftSum + rightSum;
    }

    public static int divide(int[] nums, int low, int high) {
        if (nums[low] == nums[high])
            return nums[low];

        int mid = low + (high - low) / 2;

        int leftSum = divide(nums, low, mid);
        int rightSum = divide(nums, mid + 1, high);

        int mergedSum = conquer(nums, low, mid, high);
        return Math.max(leftSum, Math.max(rightSum, mergedSum));
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4, 5, 7, -1, -5, 8, -3 };
        System.out.println(divide(nums, 0, nums.length - 1));
    }
}