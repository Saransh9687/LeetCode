class Solution {
    public int minMoves2(int[] nums) {

        //1 2 4 6 10
        //13
        
        Arrays.sort(nums);

        int count =0;
        int mid = nums[nums.length/2];

        for(int x : nums){
            count += Math.abs(mid-x);
        }

        return count;

    }
}