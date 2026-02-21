class Solution {
    public String longestPalindrome(String s) {

        //abcba

        if (s == null || s.length() == 0) {
            return "";
        }

        int start =0;
        int maxLen=1;

        for(int i=0;i<s.length();i++){

            int len1 = expandFromCenter(s,i,i);
            int len2 = expandFromCenter(s,i,i+1);

            int len = Math.max(len1,len2);

            if(len>maxLen){
                maxLen = len;
                start = i - (len-1)/2;
            }
        }
        return s.substring(start,start+maxLen);
        
    }

    public static int expandFromCenter(String s, int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;r++;
        }
        return r-l-1;
    }
}