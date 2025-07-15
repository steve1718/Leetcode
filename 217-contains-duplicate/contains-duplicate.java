class Solution {
    public boolean containsDuplicate(int[] nums) {
        //optimized approach
        HashSet<Integer> set=new HashSet();
        for(int i:nums){
            if(set.contains(i)){
            return true;
            }
            set.add(i);
        }
        return false;
    }
}