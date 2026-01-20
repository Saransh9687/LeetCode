class Solution {
    public int findDuplicate(int[] a) {
        
        Set<Integer> set = new HashSet<>();

        for(int n :a){
           if(set.add(n));
           else return n;
        }

        return 0;
        // int ans=0;
        // Arrays.sort(a);
        // for(int i=1;i<a.length;i++){
        //     if(a[i]==a[i-1]){
        //         ans=a[i];
        //     }
        // }
        // return ans;

    }
}