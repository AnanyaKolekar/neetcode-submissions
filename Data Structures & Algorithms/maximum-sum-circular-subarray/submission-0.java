//by using kadanes algorithm 
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax= nums[0], globMin=nums[0];
        int currMax=0,currMin=0,total=0;

        for(int num:nums){
            currMax = Math.max(currMax+num,num);
            currMin = Math.min(currMin+num,num);
            total += num;
            globMax=Math.max(globMax,currMax);
            globMin=Math.min(globMin,currMin);
        }
        return globMax>0 ? Math.max(globMax,total-globMin) : globMax;
    }
}