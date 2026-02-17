class Solution {
    public int firstUniqChar(String s) {

        int res = Integer.MAX_VALUE;

		int fi[] = new int[256];

		for(int i=0;i<256;i++) {
			fi[i]=-1;
		}

        for(int i=0;i<s.length();i++){
            if(fi[s.charAt(i)]==-1){
                fi[s.charAt(i)]=i;
            }else{
                fi[s.charAt(i)]=-10;
            }
        }

        for(int i=0;i<256;i++){
            if(fi[i]>=0){
                res = Math.min(fi[i],res);
            }
        }
        return (res== Integer.MAX_VALUE)?-1:res;


        
    }
}