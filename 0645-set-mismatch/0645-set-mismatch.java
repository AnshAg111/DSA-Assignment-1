class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[2];
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]!=i+1){
                if(i>0 && nums[i]==nums[i-1]){
                    arr[0]=nums[i];
                    int j=i+1;
                    while(j<n && nums[j]==j) j++;
                    arr[1]=j;
                }
                else{
                    arr[1]=i+1;
                    int j=i+1;
                    while(j<n && nums[j]!=nums[j-1]) j++;
                    arr[0]=nums[j];
                }
                break;
            }
        }
        return arr;
    }
}