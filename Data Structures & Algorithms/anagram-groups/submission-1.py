class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)

        for item in strs:
            resS = ''.join(sorted(item))
            res[resS].append(item)

        return list(res.values())