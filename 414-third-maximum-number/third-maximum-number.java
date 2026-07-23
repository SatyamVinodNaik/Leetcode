class Solution {
    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int current : nums) {

            // Ignore duplicates
            if (current == first || current == second || current == third) {
                continue;
            }

            if (current > first) {
                third = second;
                second = first;
                first = current;
            }
            else if (current > second) {
                third = second;
                second = current;
            }
            else if (current > third) {
                third = current;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}