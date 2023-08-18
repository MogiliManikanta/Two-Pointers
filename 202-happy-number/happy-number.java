class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(set.add(n)){
            int squaresum=0;
            while(n!=0){
                int temp = n%10;
                squaresum += (temp*temp);
                n/=10; 
            }
            if(squaresum==1){
                return true;
            }
            else{
                n=squaresum;
            }
        }
        return false;
    }
}
/**The idea is to use one hash set to record sum of every digit square of every number occurred. Once the current sum cannot be added to set, return false; once the current sum equals 1, return true; */