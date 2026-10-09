class Solution {
    public boolean hasDuplicate(int[] nums) {
    Set<Integer> set =  new HashSet<>(Arrays.stream(nums).boxed().toList());
    if(set.size() < nums.length ){
        return true;
    }
    return false;
}
}