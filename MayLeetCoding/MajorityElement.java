class MajorityElement {
    /*
     * 
     * We are given an array of numbers and have to find the majority element in
     * that array. A majority element is one that occurs at least n/2 times in the
     * array, where n is the length of the array. We use Boyer-Moore voting algo,
     * which is basically the logic that each element votes for itself and the
     * majority lement wins because it gets the most votes.
     *
     */
    public static int majorityElement(final int[] nums) {
        int value = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                value = nums[i];
            if (nums[i] == value)
                count++;
            else
                count--;
        }

        return value;
    }

    public static void main(final String[] args) {
        final int[] nums = new int[] { 2, 2, 3 };

        System.out.println(majorityElement(nums));
    }
}