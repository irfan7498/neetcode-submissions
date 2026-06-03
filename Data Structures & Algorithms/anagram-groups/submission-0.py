class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        res = defaultdict(list)

        for item in strs:

            count = [0] * 26

            for char in item :
                count[ord(char)-ord("a")] += 1
            
            res[tuple(count)].append(item)

        return list(res.values())