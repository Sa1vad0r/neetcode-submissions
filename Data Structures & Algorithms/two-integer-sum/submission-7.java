class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> has = new HashMap<>();

        for (int i = 0; i < nums.length; i++ ){
            int ideal = target - nums[i];

            if(has.containsKey(ideal)){
                return new int[] {has.get(ideal), i};
            }
            has.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
