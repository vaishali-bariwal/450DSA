package Arrays.FindTheDuplicateNumber;

class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
        if (nums[Math.abs(nums[i])] > 0) {
            nums[Math.abs(nums[i])] =  -1 * nums[Math.abs(nums[i])];
        } 
        else {
            return Math.abs(nums[i]);
            }
        }
        
        return ans;
    }
}
