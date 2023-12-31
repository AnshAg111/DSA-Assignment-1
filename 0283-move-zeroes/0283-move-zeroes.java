class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0, n=nums.length;
        while(i<n && j<n){
            while(i<n && nums[i]!=0) i++;
            while(j<n && nums[j]==0) j++;
            if(i>=n || j>=n) break;
            if(j>i){
                nums[i]=nums[j];
                nums[j]=0;
            }
            else{
                j++;
            }
        }
    }
}