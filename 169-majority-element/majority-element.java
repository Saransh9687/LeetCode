class Solution {
    public int majorityElement(int[] nums) {

     int n=nums.length,res=0,majority=0;

     Map<Integer,Integer> map = new HashMap<>();

     for(int a:nums){
        map.put(a,map.getOrDefault(a,0)+1);
        if(map.get(a)>majority){
            res=a;
            majority= map.get(a);
        }
     }
     return res;

    }
}