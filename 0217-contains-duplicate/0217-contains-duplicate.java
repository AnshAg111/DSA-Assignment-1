class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        HashMap<Integer, Integer>m=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(m.containsKey(nums[i])) {
                flag=true;
                break;
            }
            m.put(nums[i], 1);
        }
        
        return flag;
    }
}