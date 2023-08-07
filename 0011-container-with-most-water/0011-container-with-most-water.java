class Solution {
    public int maxArea(int[] height) {
     int i=0;
     int j= height.length-1;
     int mx =0; // 가장 최종 값 
     while(i<j){
    int area = (j-i)* Math.min(height[i] , height[j]);  
         if( area > mx) { mx = area; }
         if(height[i] < height[j]){
             i++;
         }
         else{
             j--;
         }
        
       
    }
         return mx;
    }
}