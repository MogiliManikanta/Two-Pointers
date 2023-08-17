class Solution {
    public int compress(char[] chars) {
        if(chars==null || chars.length<=1){
            return 1;
        }
        int i=0;
        for(int j=1,count=1;j<=chars.length;count++,j++){
            if(j==chars.length || chars[j-1]!=chars[j]){
                chars[i]=chars[j-1];
                i++;
                if(count>=2){
                    for(char digit : String.valueOf(count).toCharArray()){
                        chars[i]=digit;
                        i++;
                    }
                }
                count=0;
            }
        }
        return i;
    }
}