class Solution:
    def maxArea(self, heights: List[int]) -> int:
        # finding max heights we have 
        # finding area with respect to max heights and x distance ;
        # so , we have to find max height with max width x , which will lead to max area 
        # formula min(max_height1, max_height2) * max_index_diff 
        # for find max_height1 
        # 1,2,3,4,5,6,7,7
        
        max_area = 0
        l , r = 0 , len(heights)-1
        while(l<r):
            area= (r - l) * min(heights[l], heights[r])
            max_area= max(area, max_area)
            if heights[r]<heights[l]:
                r-=1 
            else:
                l += 1
        return max_area   