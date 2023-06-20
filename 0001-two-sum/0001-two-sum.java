class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>m=new HashMap<>();
        int[] ans=new int[2];
        int n=nums.length;
        for(int i=0; i<n; i++){
            m.put(nums[i], i);
        }
        for(int i=0; i<n; i++){
            if(m.containsKey(target-nums[i]) && m.get(target-nums[i])!=i){
                ans[0]=i;
                ans[1]=m.get(target-nums[i]);
                break;
            }
        }
        return ans;
    }
}