class Solution {
    public int calPoints(String[] operations) {
        
        int n = operations.length;
        int sum=0;
        int j=0;

        int [] a = new int[n];

        for(int i=0;i<n;i++){
            if(operations[i].charAt(0)=='+'){
                a[j] = a[j-1] + a[j-2];
                j++;
            }else if(operations[i].charAt(0)=='D'){
                a[j] = 2*a[j-1];
                j++;
            }else if(operations[i].charAt(0)=='C'){
                j--;
                a[j] =0;
            }else{
                a[j] = Integer.parseInt(operations[i]);
                j++;
            }
        }

       for(int i=0;i<n;i++){
        sum+=a[i];
       }

        return sum;

    }
}