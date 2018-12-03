class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new LinkedList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        StringBuilder cur = new StringBuilder();
        cur.append(nums[0]);
        if (nums.length == 1){
            res.add(cur.toString());
            return res;
        }
        int cnt = 1;
        if(nums[1] - nums[0] != 1){
            res.add(cur.toString());
                cur.setLength(0);
                cur.append(nums[1]);
        } else {
            cnt++;
        }
        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i-1] != 1){
                if(cnt > 1){
                    cur.append("->");
                    cur.append(nums[i-1]);
                }
                res.add(cur.toString());
                cur.setLength(0);
                cur.append(nums[i]);
                cnt = 1;
            }
            else{
                cnt++;
            }
        }
        if (cnt > 1){
            cur.append("->");
            cur.append(nums[nums.length-1]);
        }
        res.add(cur.toString());
        return res;
    }
}
