class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int n:nums){
            if(n>0){
                pos.add(n);
            }else{
                neg.add(n);
            }
        }

        int index=0,pos_elm=0,neg_elm=0;
        for(int n:nums){
            if(index%2==0){
                res.add(pos.get(pos_elm++));
            }else{
                res.add(neg.get(neg_elm++));
            }
            index++;
        }

         int a[] = new int[res.size()];
          for(int i=0;i<res.size();i++){
            a[i] = res.get(i);
        }

        return a;
        
    }
}