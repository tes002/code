class Solution {
    public int findShortestSubArray(int[] nums) {
        // find the num with highest freq, hashmap, O(n)
        // find the first and last one O(n)
        if(nums == null || nums.length == 0 ){
            return 0;
        }
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        int max = 0;
        int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++){
            if(cnt.containsKey(nums[i])){
                cnt.put(nums[i], cnt.get(nums[i])+1);
                right.put(nums[i], i);
            } else {
                cnt.put(nums[i], 1);
                left.put(nums[i], i);
                right.put(nums[i], i);
            }
            max = Math.max(max, cnt.get(nums[i]));
        }
        int min = nums.length;
        for(int i = 0; i < nums.length; i++){
            if (cnt.get(nums[i]) == max){
                min = Math.min(min, right.get(nums[i]) - left.get(nums[i]) + 1);
            }
        }
        return min;
    }
}
