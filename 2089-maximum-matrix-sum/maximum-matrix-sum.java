class Solution {
    public long maxMatrixSum(int[][] matrix) {

       long sum =0;
       int negNo =0;
       int minAbs = Integer.MAX_VALUE;

       for(int[]row:matrix){
        for(int val:row){
            if(val<0) negNo++;
            int absVal = Math.abs(val);
            sum+=absVal;
            minAbs = Math.min(minAbs,absVal);
        }
       }

       if(negNo%2==1){
        sum = sum- 2L*minAbs;
       }
       return sum;
    
    }
}
