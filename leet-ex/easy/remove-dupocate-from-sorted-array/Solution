class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt=0;
        
        if(nums.length ==0) return 0;
        
        for (int i=0; i< nums.length; i++){
                if(nums[i] != nums[cnt]){
                 nums[++cnt] = nums[i];
                }
        }
        
        
        return cnt +1;
    }
}