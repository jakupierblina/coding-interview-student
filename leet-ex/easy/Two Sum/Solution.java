class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        
        int i=0;
        int sum;
        
        while(i < nums.length){
            sum = target - nums[i];
            
             if (prevMap.containsKey(sum)) {
                return new int[]{ prevMap.get(sum), i };
            }
            prevMap.put(nums[i], i);
            i++;
            
        }
       
        return new int[0]; 
    }
    
}