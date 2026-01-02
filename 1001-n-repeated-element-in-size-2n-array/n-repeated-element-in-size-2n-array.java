class Solution {
    public int repeatedNTimes(int[] nums) {

        Set<Integer> hs = new HashSet<>();

        for(int i : nums){
            if(hs.contains(i)){
                return i;
            }else{
                hs.add(i);
            }
        }
        return -1;
        
    }
}