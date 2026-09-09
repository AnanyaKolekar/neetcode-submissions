class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet <>();
        for (int value : nums){
            //set.add(value);
            if(set.contains(value)){
                return true;
            }
            set.add(value);
        }
        return false;
        

    }
}