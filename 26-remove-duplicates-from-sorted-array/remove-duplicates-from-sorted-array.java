class Solution {
    
    public int removeDuplicates(int[] nums) {

        if(nums.length==0) return 0;
        // i=5 j=9
        // 0 1 2 3 4 5 6 7 8 9 index
        // 0 1 2 3 4 2 2 3 3 4 element

        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[j-1]){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
      
}

}