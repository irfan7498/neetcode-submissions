class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1]*len(nums)

        n= len(nums)
        i = 1

        while i < n:
            output[i] = output[i-1] * nums[i-1]
            i += 1

        i = n-2
        postfix = nums[n-1]
        while i >= 0 :
            output[i] = output[i] * postfix
            postfix = postfix * nums[i]
            i -=1

        return output 