class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix , postfix , output = [1]*len(nums), [1]*len(nums),  [1]*len(nums)

        n,prefix[0] = len(nums), 1
        i = 1

        while i < n:
            prefix[i] = prefix[i-1] * nums[i-1]
            i += 1

        i , postfix[n-1] = n-2, 1
        while i >= 0 :
            postfix[i] = postfix[i +1 ] * nums[i+1]
            i -=1
        i = 0

        while i < n:
            output[i] = prefix[i] * postfix[i]
            i += 1

        return output 