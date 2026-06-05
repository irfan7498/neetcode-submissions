class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        ntof = {}
        fton = [[] for i in range(len(nums) + 1 )]


        #mapped eached element:
        for n in nums:
            ntof[n] = 1 + ntof.get(n, 0)

        #map freq with num to get top k values
        for num, ct in ntof.items():
            fton[ct].append(num)


        res = []
        for i in range(len(fton) - 1 , 0, -1):
            for n in fton[i]:
                res.append(n)
                if len(res) == k:
                    return res