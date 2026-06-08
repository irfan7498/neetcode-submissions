class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums = list(set(nums))
        nums.sort()
        Max = 0
        count = 0
        if(len(nums) == 0):
            return Max
        for i in range(len(nums)):
            if (i ==  len(nums)-1):
                return Max + 1
            if(nums[i] == nums[i+1]-1):
                count +=1
            else:
                count = 0
            Max = max(Max, count)
        return Max + 1