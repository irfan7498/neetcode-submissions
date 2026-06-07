class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1]*len(nums)

        n= len(nums)

        for i in range(1,n):
            output[i] = output[i-1] * nums[i-1]
            
        postfix = nums[n-1]

        for i in range(n-2, -1, -1):
            output[i] = output[i] * postfix
            postfix = postfix * nums[i]

        return output 