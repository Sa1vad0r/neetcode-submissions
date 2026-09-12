class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexNums = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int ideal = target - nums[i];
            if(indexNums.containsKey(ideal)){
                return new int[]{indexNums.get(ideal), i};
            }
            indexNums.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
