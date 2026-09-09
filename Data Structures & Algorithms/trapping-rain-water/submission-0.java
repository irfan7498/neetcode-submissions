class Solution {
    public int trap(int[] height) {
        int[] rightMax = new int[height.length];
        int[] leftMax = new int [height.length];
        //max
        rightMax[height.length-1] = height[height.length-1];
        leftMax[0] = height[0];
        for(int i = 1 ; i < height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        
        for(int i = height.length-1-1 ; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for(int i = 0; i < height.length; i++){
            height[i] = Math.min(leftMax[i],rightMax[i]) - height[i];
        }

        int res = 0;
        for(int i = 0; i < height.length; i++){
            res += height[i];
        }
        return res;
    }
}
