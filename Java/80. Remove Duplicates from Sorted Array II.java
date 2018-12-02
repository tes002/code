class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        if(nums.length <= 2){
            return nums.length;
        }
        //inspired by discuss forum
        int i = 1;
        int j = 1;
        int cnt = 1;
        while (i < nums.length && j < nums.length){
            if(nums[j] != nums[j-1]) {
                // i might be stay at the third time duplicates, assign the new num to i
                cnt = 1;
                nums[i] = nums[j];
                i++;
            } else {
                if(cnt < 2){
                    nums[i] = nums[j];
                    i++;
                    cnt++;
                }
            }
            j++;
        }
        return i;
    }
}
