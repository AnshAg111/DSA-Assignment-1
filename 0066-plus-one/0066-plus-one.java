class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while(i>=0){
            if(digits[i]<9) {
                digits[i]+=1;
                break;
            }
            else{
                digits[i]=0;
                i--;
            }
        }
        if(digits[0]!=0) return digits;
        int n=digits.length;
        int[] ans=new int[n+1];
        ans[0]=1;
        for(int j=1; j<=n; j++) ans[j]=digits[j-1];
        return ans;
    }
}