class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        for num in nums:
            freq[num] = freq.get(num, 0) + 1 # key = number, value = freq
        
        arr = [] # can iterate through dict and output tuples
        for key, value in freq.items():
            arr.append([value, key])
            arr.sort()
        
        result = []
        while len(result) < k:
            result.append(arr.pop()[1])
        return result