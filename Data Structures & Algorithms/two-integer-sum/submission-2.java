class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberIndex = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            numberIndex.put(nums[j], j);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (numberIndex.containsKey(diff) && i != numberIndex.get(diff)) {
                   return new int[] {i, numberIndex.get(diff)};
                }
            } return new int[] {0, 0};
        } 
    }
