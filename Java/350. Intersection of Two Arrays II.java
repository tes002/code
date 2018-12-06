class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < nums1.length; i++){
            if(cnt.containsKey(nums1[i] )){
                cnt.put(nums1[i], cnt.get(nums1[i])+1);
            } else{
                cnt.put(nums1[i],1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){
            if(cnt.containsKey(nums2[i]) && cnt.get(nums2[i]) >= 1){
                cnt.put(nums2[i], cnt.get(nums2[i]) - 1);
                res.add(nums2[i]);
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
