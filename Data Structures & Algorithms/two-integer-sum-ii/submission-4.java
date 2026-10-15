class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> numberIndex = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int perfectPair = target-numbers[i];

            if(numberIndex.containsKey(perfectPair)){
                return new int[] {numberIndex.get(perfectPair)+1, i+1};
            }
            numberIndex.put(numbers[i] , i);
        }

        return new int[] {0, 0};
    }
}
