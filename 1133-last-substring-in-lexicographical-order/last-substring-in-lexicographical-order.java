class Solution {
    public String lastSubstring(String s) {
        int i=0,j=1,k=0;
        int n = s.length();
        while(i<n && j<n && k<n){
            if(i+k >= n || j+k >= n){
                break;
            }
            if(s.charAt(i+k)== s.charAt(j+k)){
                k++;
            }
            else{
                 if(s.charAt(i+k)<s.charAt(j+k)){
                    i=i+k+1;
                }
                else{
                    j=j+k+1;
                }
                if(i==j){
                    j++;
                }
                k=0;
            }
        }
        int last = Math.min(i,j);
        return s.substring(last);
    }
}