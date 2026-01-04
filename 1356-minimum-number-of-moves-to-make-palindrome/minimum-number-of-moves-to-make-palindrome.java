class Solution {
    public int minMovesToMakePalindrome(String s) {

        int n = s.length();
        char[] a = s.toCharArray();
        int steps=0;
        int l=0,r=n-1;

        while(l<r){
            if(a[l]==a[r]){
                l++;r--;
            }else{
                int k=r;
                k= matchingIndexWithL(a,l,k);

                if(k==l){
                    swap(a,l);
                    steps++;
                }else{
                    while(k<r){
                        swap(a,k);
                        steps++;
                        k++;
                    }
                    l++;r--;
                }

            }
        }

        return steps;
        
    }
    public int matchingIndexWithL(char a[],int l,int k){
        while(k>l){
            if(a[l]==a[k]){
                return k;
            }
            k--;
        }
        return k;
    }
    public void swap(char a[],int l){
        if(l+1<a.length){
            char temp = a[l];
            a[l] = a[l+1];
            a[l+1] = temp;
        }
    }
}