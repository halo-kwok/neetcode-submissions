
class Solution {
    public int maxArea(int[] heights) {
        /***
            two pointers, maxArea depends on min(height[a], height[b]) * b - a
            need to increment/ decrement l or r pointers depending on condition 
            like (height[l] < height[r] or smthng) 
        ***/
        int l = 0;
        int r = heights.length - 1; // .length for static lists
        int maxArea = 0; // init maxArea
        int currentArea = 0;
        while (l < r) {
            currentArea = Math.min(heights[l], heights[r]) * (r - l);
            if (currentArea > maxArea) {maxArea = currentArea;}
            // update left or/and right pointer depending on some condition
            if (heights[l] < heights[r]) {l++;} // increments left pointer
            else {r--;} // r decreases even when heights are equal
        }
        return maxArea;
    }
}
