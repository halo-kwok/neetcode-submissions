class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numToIndex.containsKey(diff)) {
                return new int[]{numToIndex.get(diff), i};
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}