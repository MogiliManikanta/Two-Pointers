class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int maxArea=Integer.MIN_VALUE;
       //int area=0;
       while(left<right){
           int area=Math.min(height[left],height[right])*(right-left);// calculating the small one from right & left and and distance like this
           maxArea=Math.max(area,maxArea);
           if(height[left]<height[right]){
               left++; // incrementing the left 
           }
           else{
               right--;
           }
       }
       return maxArea; 
    }
}