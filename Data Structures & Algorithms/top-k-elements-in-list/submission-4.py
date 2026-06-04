class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        freq_table = defaultdict(int)

        for i in nums:
            freq_table[i] += 1

        arr = []

        for key, value in freq_table.items():
            arr.append([value, key])

        arr.sort(reverse = True)

        return [arr[i][1] for i in range(k)]

