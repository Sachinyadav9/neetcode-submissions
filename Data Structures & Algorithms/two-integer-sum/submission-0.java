class Solution {
    public int[] twoSum(int[] nums, int target) {
          int i =0 , j = 1;
     

          while (i < j) {

        while (j < nums.length) {
            if(nums[i] + nums[j] == target){
                return new int[]{i , j};
            }
            j++;
        }
        if(i+1 == nums.length-1){
            return new int[]{};
        }
        i++;
        j=i+1;
        
     }
     return new int[]{};
    }
}
