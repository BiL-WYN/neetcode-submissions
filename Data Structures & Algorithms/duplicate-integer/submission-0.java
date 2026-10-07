class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 1){
            return false;
        }
        for (int i = 0; i < nums.length; i++){
            int numToCompare = nums[i];
            for (int k = i + 1; k < nums.length; k++){
                if (numToCompare == nums[k]){
                    return true;
                }
            }
        }

        return false;
        
    }
}