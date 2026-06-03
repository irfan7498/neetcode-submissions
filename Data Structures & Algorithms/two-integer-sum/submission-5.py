class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}  # Map: value -> original index
        
        for idx, num in enumerate(nums):
            diff = target - num  # The exact number we need to find
            
            if diff in seen:
                return [seen[diff], idx]
                
            seen[num] = idx  # Save current number and index for later
            
        return []
