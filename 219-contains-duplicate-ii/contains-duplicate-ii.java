class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> seen = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(i>k){
                seen.remove(nums[i-k-1]);
            }

            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
        }
        return false;


        // boolean flag = false;

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             if(Math.abs(i-j)<=k){
        //                 flag = true;
        //             }
        //         }
        //     }
        // }
        // return flag;
        
    }
}