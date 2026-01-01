class Solution {
    public boolean isPalindrome(int x) {

        int temp =x;
        int rev=0;
        while(temp>0){
            int last = temp%10;
            rev = rev*10 + last; 
            temp/=10;
        }

        return rev==x ? true:false;
        
    }
}