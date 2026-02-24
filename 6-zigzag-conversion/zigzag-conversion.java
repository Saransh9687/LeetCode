class Solution {
    public String convert(String s, int numRows) {
        //abcdefghi
        //a      g
        //b   f  h
        //c e    i
        //d 

        if(numRows ==1 || numRows>=s.length()) return s;

        int idx=0,dir=1;

        List<Character>[] rows = new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            rows[i] = new ArrayList<>();
        }

        for(char c: s.toCharArray()){
            rows[idx].add(c);
            if(idx==0){
                dir=1;
            }else if(idx ==numRows-1){
                dir =-1;
            }
            idx+=dir;
        }

        StringBuilder res = new StringBuilder();
        for(List<Character> row:rows){
            for(char c:row){
                res.append(c);
            }
        }

        return res.toString();
    }
}