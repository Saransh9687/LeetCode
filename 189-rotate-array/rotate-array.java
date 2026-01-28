class Solution {
    public void rotate(int[] nums, int k) {
        //[1,2,3,4,5] k=2
        //[5,4,3,2,1]
        //[4,5,3,2,1]
        ///[4,5,1,2,3]

        int n = nums.length;

        if (n <= 1) return;   // 🔥 IMPORTANT FIX

        k = k % n;
        if (k == 0) return;
      

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public void reverse(int a[],int l,int r){
        while(l<r){
            int temp =a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;r--;
        }
    }
}