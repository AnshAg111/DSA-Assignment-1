class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, j=nums.length-1, c=0, n=nums.length;
        for(int idx=0; idx<n; idx++) {
            if(nums[idx]==val) c++;
        }
        while(i<j){
            if(nums[i]==val){
                while(j>i && nums[j]==val) j--;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
            i++;
        }
        return n-c;
    }
}