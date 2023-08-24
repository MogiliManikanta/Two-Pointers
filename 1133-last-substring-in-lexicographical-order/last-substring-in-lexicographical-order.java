class Solution {
        public String lastSubstring(String s) {
        int n = s.length();
        //k is the len when we have two candidates
        //i is the first candidate start position, j is the second one (can not be candidate)
        int i = 0, j= 1, k = 0;
        while (i < n && j < n && k < n) {
            if (i + k >= n || j + k >= n) {
                break;
            }
            // they have same start point, then increase the length
            if (s.charAt(i + k) == s.charAt(j + k)) {
                k++;
            } else {
                // now two candidates are different, then which one is larger
                if (s.charAt(i + k) < s.charAt(j + k)) {
                    i = i + k + 1; // j becomes the candidate, i need move forward
                } else {
                     j = j + k + 1; // i becomes the candidate
                }
                if (i == j) { 
                    j++; // potational i, j stay at the same position, j move forward(i also can move)
                }
                k = 0; //reset the len
            }
        }
        int l = Math.min(i, j);
        return s.substring(l);
    }
}