class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> valueIndexMap = new HashMap(nums.length);
        
        for(int i = 0; i < nums.length; i++) {
            valueIndexMap.put(nums[i], i);
        }
            
        Integer targetIndex1 = -1;
        Integer targetIndex2 = -1;
        boolean found = false;
        
        //let's see if target MINUS current num value is in Map???
        for(int i = 0; i < nums.length; i++) {
            targetIndex1 = i;
            targetIndex2 = valueIndexMap.get(target - nums[i]);
            if(targetIndex2 != null && targetIndex1 != targetIndex2) {
                found = true;
                break;
            }
        }
        //we're assuming we always have an answer as the problem states
        return new int[]{targetIndex1, targetIndex2};
    }
}
