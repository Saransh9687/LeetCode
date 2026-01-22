class Solution {
    public List<Integer> majorityElement(int[] nums) {
//[3,2,3]
        int n = nums.length;
        int threasholdValue = nums.length/3;
        
         Map<Integer, Integer> map = new HashMap<>();
            
        List<Integer> majorityElements = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int ele = entry.getKey();
            int count = entry.getValue();

            if(count>threasholdValue){
                majorityElements.add(ele);
            }
        }

        return majorityElements;
    }
}