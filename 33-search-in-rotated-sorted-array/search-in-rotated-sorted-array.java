class Solution {
    public int search(int[] nums, int target) {

        // [4,5,6,7,0,1,2]  t =0

        return sorted(nums,0,nums.length-1,target);

    

        
    }

    public int sorted(int a[],int low,int high,int target){
         if(a.length ==1){
            if(a[0]==target){
                return 0;
            }else{
                return -1;
            }
        }
        while(low<=high){
            int mid = low +(high-low)/2;
            if(a[mid]==target){
                return mid;
            }else if(a[low]<=a[mid]){
                if(a[low]<=target && target <=a[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else if(a[mid]<=target && target <=a[high]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}