class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # values = (items for items in nums) 
        # make a dict: key would be the item in num and value being count 
        count = {}
        for item in nums:
            count[item] = count.get(item, 0) + 1
            if (count[item] > 1):
                return True
        return False
        